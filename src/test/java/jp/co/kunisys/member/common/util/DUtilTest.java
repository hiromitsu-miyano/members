package jp.co.kunisys.member.common.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link DUtil}のテストクラス
 */
public class DUtilTest {

	/**
	 * {@link DUtil#getTimestamp()}のテスト01
	 */
	@Test
	public void testGetTimestamp01() {
		Assert.assertNotNull(DUtil.getTimestamp());
	}

}
