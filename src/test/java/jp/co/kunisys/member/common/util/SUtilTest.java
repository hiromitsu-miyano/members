package jp.co.kunisys.member.common.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link SUtil}のテストクラス
 */
public class SUtilTest {

	/**
	 * {@link SUtil#valueOf(Object)}のテスト01
	 */
	@Test
	public void testValueOf01Tx() {
		//String
		String str = "abc";
		String ret = SUtil.valueOf(str);
		Assert.assertEquals("abc", ret);
	}
	/**
	 * {@link SUtil#valueOf(Object)}のテスト02
	 */
	@Test
	public void testValueOf02Tx() {
		//Short
		Short s = 1;
		String ret = SUtil.valueOf(s);
		Assert.assertEquals(ret, "1");
	}
	/**
	 * {@link SUtil#valueOf(Object)}のテスト03
	 */
	@Test
	public void testValueOf03Tx() {
		//Integer
		String ret = SUtil.valueOf(2);
		Assert.assertEquals(ret, "2");
	}
	/**
	 * {@link SUtil#valueOf(Object)}のテスト04
	 */
	@Test
	public void testValueOf04Tx() {
		//Long
		String ret = SUtil.valueOf(3L);
		Assert.assertEquals(ret, "3");
	}
	/**
	 * {@link SUtil#valueOf(Object)}のテスト05
	 */
	@Test
	public void testValueOf05Tx() {
		//Date
		String ret = SUtil.valueOf(new Date());
		Assert.assertTrue(ret.length() > 0);
	}
	/**
	 * {@link SUtil#valueOf(Object)}のテスト06
	 */
	@Test
	public void testValueOf06Tx() {
		//null
		String ret = SUtil.valueOf(null);
		Assert.assertEquals("", ret);
	}


	/**
	 * SUtil.escape(String value)
	 */
	@Test
	public void testEscape() {
		String val = "';select * from dual;select * from dual where ''='";

		String ret = SUtil.escape(val);
		assertEquals(ret, "'';select * from dual;select * from dual where ''''=''");
	}


	/**
	 * {@link SUtil#equals(String, String)}のテスト01
	 */
	@Test
	public void testEquals01Tx() {
		boolean ret = SUtil.equals("hoge", "hoge");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#equals(String, String)}のテスト02
	 */
	@Test
	public void testEquals02Tx() {
		boolean ret = SUtil.equals("hoge", "fuga");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#equals(String, String)}のテスト03
	 */
	@Test
	public void testEquals03Tx() {
		boolean ret = SUtil.equals(null, "fuga");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#equals(String, String)}のテスト04
	 */
	@Test
	public void testEquals04Tx() {
		boolean ret = SUtil.equals(null, null);
		Assert.assertTrue(ret);
	}


	/**
	 * {@link SUtil#notequals(String, String)}のテスト01
	 */
	@Test
	public void testNotequals01Tx() {
		boolean ret = SUtil.notequals("hoge", "hoge");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#notequals(String, String)}のテスト02
	 */
	@Test
	public void testNotequals02Tx() {
		boolean ret = SUtil.notequals("hoge", "fuga");
		Assert.assertTrue(ret);
	}


	/**
	 * {@link SUtil#isBlank(String)}のテスト01
	 */
	@Test
	public void testIsBlank01Tx() {
		boolean ret = SUtil.isBlank("abc");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#isBlank(String)}のテスト02
	 */
	@Test
	public void testIsBlank02Tx() {
		boolean ret = SUtil.isBlank("");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#isBlank(String)}のテスト03
	 */
	@Test
	public void testIsBlank03Tx() {
		boolean ret = SUtil.isBlank(" ");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#isBlank(String)}のテスト04
	 */
	@Test
	public void testIsBlank04Tx() {
		boolean ret = SUtil.isBlank("　");
		Assert.assertTrue(ret);
	}


	/**
	 * {@link SUtil#isNotBlank(String)}のテスト01
	 */
	@Test
	public void testIsNotBlank01Tx() {
		boolean ret = SUtil.isNotBlank("abc");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#isNotBlank(String)}のテスト02
	 */
	@Test
	public void testIsNotBlank02Tx() {
		boolean ret = SUtil.isNotBlank("");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#isNotBlank(String)}のテスト03
	 */
	@Test
	public void testIsNotBlank03Tx() {
		boolean ret = SUtil.isNotBlank(" ");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#isNotBlank(String)}のテスト04
	 */
	@Test
	public void testIsNotBlank04Tx() {
		boolean ret = SUtil.isNotBlank("　");
		Assert.assertFalse(ret);
	}


	/**
	 * {@link SUtil#isEmpty(String)}のテスト01
	 */
	@Test
	public void testIsEmpty01Tx() {
		boolean ret = SUtil.isEmpty("abc");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#isEmpty(String)}のテスト02
	 */
	@Test
	public void testIsEmpty02Tx() {
		boolean ret = SUtil.isEmpty("");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#isEmpty(String)}のテスト03
	 */
	@Test
	public void testIsEmpty03Tx() {
		boolean ret = SUtil.isEmpty(" ");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#isEmpty(String)}のテスト04
	 */
	@Test
	public void testIsEmpty04Tx() {
		boolean ret = SUtil.isEmpty("　");
		Assert.assertFalse(ret);
	}


	/**
	 * {@link SUtil#isNotEmpty(String)}のテスト01
	 */
	@Test
	public void testIsNotEmpty01Tx() {
		boolean ret = SUtil.isNotEmpty("abc");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#isNotEmpty(String)}のテスト02
	 */
	@Test
	public void testIsNotEmpty02Tx() {
		boolean ret = SUtil.isNotEmpty("");
		Assert.assertFalse(ret);
	}
	/**
	 * {@link SUtil#isNotEmpty(String)}のテスト03
	 */
	@Test
	public void testIsNotEmpty03Tx() {
		boolean ret = SUtil.isNotEmpty("　");
		Assert.assertTrue(ret);
	}
	/**
	 * {@link SUtil#isNotEmpty(String)}のテスト04
	 */
	@Test
	public void testIsNotEmpty04Tx() {
		boolean ret = SUtil.isNotEmpty("　");
		Assert.assertTrue(ret);
	}


	/**
	 * {@link SUtil#upperCase(String)}のテスト01
	 */
	@Test
	public void testUpperCase() {
		String val = "AbCdEfg";

		String ret = SUtil.upperCase(val);
		Assert.assertEquals(ret, "ABCDEFG");
	}


	/**
	 * {@link SUtil#lowerCase(String)}のテスト01
	 */
	@Test
	public void testLowerCase() {
		String val = "AbCdEfg";

		String ret = SUtil.lowerCase(val);
		Assert.assertEquals(ret, "abcdefg");
	}


	/**
	 * {@link SUtil#len(String)}のテスト01
	 */
	@Test
	public void testLen01Tx() {
		String val = "あいうaえおか";

		int ret = SUtil.len(val);
		Assert.assertEquals(ret, 7);
	}
	/**
	 * {@link SUtil#len(String)}のテスト02
	 */
	@Test
	public void testLen02Tx() {
		String val = "     ";
		int ret = SUtil.len(val);
		Assert.assertEquals(ret, 5);
	}
	/**
	 * {@link SUtil#len(String)}のテスト03
	 */
	@Test
	public void testLen03Tx() {
		String val = null;
		int ret = SUtil.len(val);
		Assert.assertEquals(ret, 0);
	}


	/**
	 * {@link SUtil#left(String, int)}のテスト01
	 */
	@Test
	public void testLeft01Tx() {
		String val = "あいうaえおか";

		String ret = SUtil.left(val, 4);
		Assert.assertEquals(ret, "あいうa");
	}


	/**
	 * SUtil.right(String value, int len)
	 */
	@Test
	public void testRight() {
		String val = "あいうaえおか";

		String ret = SUtil.right(val, 4);
		assertEquals(ret, "aえおか");
	}

	/**
	 * SUtil.mid(String, int)
	 */
	@Test
	public void testMid_01Tx() {
		String val = "あいうえおか";
		String ret = SUtil.mid(val, 2);
		assertEquals(ret, "うえおか");
	}
	/**
	 * SUtil.mid(String, int)
	 */
	@Test
	public void testMid_02Tx() {
		String ret = SUtil.mid(null, 2);
		assertNull(ret);
	}

	/**
	 * SUtil.mid(String value, int pos, int len)
	 */
	@Test
	public void testMid02Tx() {
		String val = "あいうaえおか";

		String ret = SUtil.mid(val, 2, 3);
		assertEquals(ret, "うaえ");
	}

	/**
	 * SUtil.leftPad(String value, int size, char chr)
	 */
	@Test
	public void testLeftPad() {
		String val = "12";

		String ret = SUtil.leftPad(val, 5, '0');
		assertEquals(ret, "00012");
	}

	/**
	 * SUtil.rightPad(String value, int size, char chr)
	 */
	@Test
	public void testRightPad() {
		String val = "12";

		String ret = SUtil.rightPad(val, 5, '0');
		assertEquals(ret, "12000");
	}

	/**
	 * SUtil.join(String[] array, String separator)
	 */
	@Test
	public void testJoin() {
		String[] arr = new String[]{"aaa", "bbb", "cc"};
		String ret = SUtil.join(arr, ",");
		assertEquals(ret, "aaa,bbb,cc");

		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bb");
		list.add("ccc");
		ret = SUtil.join(list, ":");
		assertEquals(ret, "aaa:bb:ccc");
	}

	/**
	 * SUtil.removeSpace(String)
	 */
	@Test
	public void testRemoveSpace() {
		String ret = SUtil.removeSpace("abcde");
		assertEquals("abcde", ret);

		ret = SUtil.removeSpace("あい うえお ");
		assertEquals("あいうえお", ret);

		ret = SUtil.removeSpace("あい うえ　お");
		assertEquals("あいうえお", ret);
	}


	/**
	 * {@link SUtil#replace(String, String, String)}のテスト
	 */
	@Test
	public void testReplace01() {
		Assert.assertEquals("abcdef", SUtil.replace("abc123", "123", "def"));
	}


	/**
	 * {@link SUtil#count(String, String)}のテスト
	 */
	@Test
	public void testCount01() {
		Assert.assertEquals(2, SUtil.count("あいうえおあいう", "あ"));
	}
	/**
	 * {@link SUtil#count(String, String)}のテスト
	 */
	@Test
	public void testCount02() {
		Assert.assertEquals(4, SUtil.count("/1/2/3/4", "/"));
	}


	/**
	 * {@link SUtil#repeat(String, int)}のテスト01
	 */
	@Test
	public void testRepeat01() {
		Assert.assertEquals("    ", SUtil.repeat(" ", 4));
	}
	/**
	 * {@link SUtil#repeat(String, int)}のテスト02
	 */
	@Test
	public void testRepeat02() {
		Assert.assertEquals("abcabcabcabc", SUtil.repeat("abc", 4));
	}


	/**
	 * {@link SUtil#convKatakanaWide(String)}のテスト01
	 */
	@Test
	public void testConvKatakanaWide01() {
		Assert.assertEquals("アイウエオ", SUtil.convKatakanaWide("ｱｲｳｴｵ"));
	}
	/**
	 * {@link SUtil#convWide(String)}のテスト01
	 */
	@Test
	public void testConvKatakanaWide02() {
		Assert.assertEquals("ガギグゲゴ", SUtil.convKatakanaWide("ｶﾞｷﾞｸﾞｹﾞｺﾞ"));
	}


	/**
	 * {@link SUtil#convKatakanaNarrow(String)}のテスト01
	 */
	@Test
	public void testConvKatakanaNarrow01() {
		Assert.assertEquals("ｱｲｳｴｵ", SUtil.convKatakanaNarrow("アイウエオ"));
	}
	/**
	 * {@link SUtil#convKatakanaNarrow(String)}のテスト01
	 */
	@Test
	public void testConvKatakanaNarrow02() {
		Assert.assertEquals("ｶﾞｷﾞｸﾞｹﾞｺﾞ", SUtil.convKatakanaNarrow("ガギグゲゴ"));
	}


	/**
	 * {@link SUtil#convNumWide(String)}のテスト01
	 */
	@Test
	public void testConvNumWide01() {
		Assert.assertEquals("０１２３４５６７８９", SUtil.convNumWide("0123456789"));
	}
	/**
	 * {@link SUtil#convNumWide(String)}のテスト02
	 */
	@Test
	public void testConvNumWide02() {
		Assert.assertNull(SUtil.convNumWide(null));
	}


	/**
	 * {@link SUtil#convNumNarrow(String)}のテスト01
	 */
	@Test
	public void testConvNumNarrow01() {
		Assert.assertEquals("0123456789", SUtil.convNumNarrow("０１２３４５６７８９"));
	}
	/**
	 * {@link SUtil#convNumNarrow(String)}のテスト02
	 */
	@Test
	public void testConvNumNarrow02() {
		Assert.assertNull(SUtil.convNumNarrow(null));
	}


	/**
	 * {@link SUtil#convLines(String)}のテスト01
	 */
	@Test
	public void testConvLines01() {
		String str = "あいうえお\nかきくけこ\nさしす";
		List<String> ret = SUtil.convLines(str);
		Assert.assertEquals(3, ret.size());
	}
	/**
	 * {@link SUtil#convLines(String)}のテスト02
	 */
	@Test
	public void testConvLines02() {
		String str = null;
		List<String> ret = SUtil.convLines(str);
		Assert.assertEquals(0, ret.size());
	}
	/**
	 * {@link SUtil#convLines(String)}のテスト03
	 */
	@Test
	public void testConvLines03() {
		String str = "";
		List<String> ret = SUtil.convLines(str);
		Assert.assertEquals(0, ret.size());
	}
	/**
	 * {@link SUtil#convLines(String)}のテスト04
	 */
	@Test
	public void testConvLines04() {
		String str = "あいうえお\nかきくけこ\nさしす\n";
		List<String> ret = SUtil.convLines(str);
		Assert.assertEquals(3, ret.size());
	}
	/**
	 * {@link SUtil#convLines(String)}のテスト05
	 */
	@Test
	public void testConvLines05() {
		String str = "\n";
		List<String> ret = SUtil.convLines(str);
		Assert.assertEquals(1, ret.size());
	}

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
