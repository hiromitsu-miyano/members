package jp.co.kunisys.member.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import jp.co.kunisys.member.security.AuthenticationProviderImpl;
import jp.co.kunisys.member.security.UserDetailsServiceImpl;

/**
 * セキュリティ設定
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/** 認証ユーザ取得サービス */
	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	/** ユーザ認証プロバイダ */
	@Autowired
	private AuthenticationProviderImpl authenticationProvider;

	/**
	 * セキュリティ設定
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/css/**","/images/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/COA000/init")
				.loginProcessingUrl("/COA000/login")
				.defaultSuccessUrl("/COB000/init", true)
				.usernameParameter("account")
				.passwordParameter("password")
				.permitAll()
				.and()
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/COB000/logout"))
				.logoutSuccessUrl("/COA000/init")
				.invalidateHttpSession(true)
				.permitAll()
				.and()
			.exceptionHandling()
				.accessDeniedPage("/COC000/forbidden");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.authenticationProvider(this.authenticationProvider)
			.userDetailsService(this.userDetailsService);
	}

}
