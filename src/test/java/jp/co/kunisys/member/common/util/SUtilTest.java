package jp.co.kunisys.member.common.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link SUtil}のテストクラス
 */
public class SUtilTest {

	/* SUtil.left(str, len) */
	@Test
	public void testLeft01() {
		Assert.assertNull(SUtil.left(null, 5));
	}
	@Test
	public void testLeft02() {
		Assert.assertEquals("abc", SUtil.left("abc", 5));
	}
	@Test
	public void testLeft03() {
		Assert.assertEquals("abcde", SUtil.left("abcdefg", 5));
	}


	/* SUtil.right(str, len) */
	@Test
	public void testRight01() {
		Assert.assertNull(SUtil.right(null, 5));
	}
	@Test
	public void testRight02() {
		Assert.assertEquals("abc", SUtil.right("abc", 5));
	}
	@Test
	public void testRight03() {
		Assert.assertEquals("cdefg", SUtil.right("abcdefg", 5));
	}
}
