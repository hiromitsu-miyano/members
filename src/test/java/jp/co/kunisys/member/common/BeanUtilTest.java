package jp.co.kunisys.member.common;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import jp.co.kunisys.member.bean.CodeBean;
import jp.co.kunisys.member.common.util.BeanUtil;

/**
 * {@link BeanUtil}のテストクラス
 */
public class BeanUtilTest {

	@Test
	public void testCopyProperties01() {
		CodeBean src = new CodeBean();
		src.setCode("test");
		src.setName("tttt");
		BeanMap dest = new BeanMap();
		BeanUtil.copyProperties(src, dest);
		Assert.assertEquals("tttt", dest.get("name"));
	}

	@Test
	public void testCopyProperties02() {
		CodeBean src = new CodeBean();
		src.setCode("test");
		src.setName("tttt");
		Map<String, Object> dest = new HashMap<>();
		BeanUtil.copyProperties(src, dest);
		Assert.assertEquals("tttt", dest.get("name"));
	}

	@Test
	public void testCopyProperties03() {
		CodeBean src = new CodeBean();
		src.setCode("test");
		src.setName("tttt");
		CodeBean dest = new CodeBean();
		BeanUtil.copyProperties(src, dest);
		Assert.assertEquals("tttt", dest.getName());
	}
}
