package jp.co.kunisys.member.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import jp.co.kunisys.member.security.AuthenticationProviderImpl;
import jp.co.kunisys.member.security.UserDetailsServiceImpl;

/**
 * セキュリティ設定
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/** 認証ユーザ取得サービス */
	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	/** ユーザ認証プロバイダ */
	@Autowired
	private AuthenticationProviderImpl authenticationProvider;

	/**
	 * セキュリティ設定の実行
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/css/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/COA000/init")
				.loginProcessingUrl("/COA000/login")
				.defaultSuccessUrl("/COB000/init")
				.usernameParameter("account")
				.passwordParameter("password")
				.permitAll();/*
				.and()
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/COA000/init")
				.invalidateHttpSession(true)
				.permitAll();*/
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.authenticationProvider(this.authenticationProvider)
			.userDetailsService(this.userDetailsService);
	}

}
