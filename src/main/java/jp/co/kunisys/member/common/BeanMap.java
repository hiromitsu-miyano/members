package jp.co.kunisys.member.common;

import java.util.LinkedHashMap;

/**
 * Stringがキーで、存在しないキーにアクセスする(get)と例外を投げるマップです。
 */
public class BeanMap extends LinkedHashMap<String, Object> {

	@Override
	public Object get(Object key) {
		if (!containsKey(key)) {
			throw new IllegalArgumentException(key + " is not fonund in " + keySet());
		}
		return super.get(key);
	}
}
