package jp.co.kunisys.member.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * Beanユーティリティ
 */
public class BeanUtil {


	/**
	 * プロパティ値を複写する
	 * @param src 複写元
	 * @param dest 複写先
	 */
	public static void copyProperties(Object src, Object dest) {
		if (src == null || dest == null) {
			return;
		}

		try {
			if (dest instanceof Map) {
				//複写先がBeanMap
				@SuppressWarnings("unchecked")
				Map<String, Object> map = (Map<String, Object>) dest;
				for (PropertyDescriptor pd : PropertyUtils.getPropertyDescriptors(src)) {
					String name = pd.getName();
					if (pd.getReadMethod() != null) {
						map.put(name, PropertyUtils.getProperty(src, name));
					}
				}
			} else {
				//複写先がそれ以外
				PropertyUtils.copyProperties(dest, src);
			}
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e1) {
			return;
		}
	}
}
