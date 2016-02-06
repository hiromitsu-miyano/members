package jp.co.kunisys.member.common.util;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link NUtil}のテストクラス
 */
public class NUtilTest {

	/* toByte(Obj) */
	@Test
	public void testToByte01() {
		Byte b = null;
		byte r = NUtil.toByte(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToByte02() {
		Byte b = 1;
		byte r = NUtil.toByte(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte03() {
		Short s = 1;
		byte r = NUtil.toByte(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte04() {
		Integer i = 1;
		byte r = NUtil.toByte(i);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte05() {
		Long l = 1L;
		byte r = NUtil.toByte(l);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte06() {
		BigDecimal b = new BigDecimal(1);
		byte r = NUtil.toByte(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte07() {
		Float f = 1f;
		byte r = NUtil.toByte(f);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte08() {
		Double d = 1d;
		byte r = NUtil.toByte(d);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte09() {
		String s = "1";
		byte r = NUtil.toByte(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToByte10() {
		Boolean b = true;
		byte r = NUtil.toByte(b);
		Assert.assertEquals(1, r);
		b = false;
		r = NUtil.toByte(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToByte11() {
		String s = "";
		byte r = NUtil.toByte(s);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToByte12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toByte(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToByte13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toByte(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}


	/* toShort(Obj) */
	@Test
	public void testToShort01() {
		Byte b = null;
		short r = NUtil.toShort(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToShort02() {
		Byte b = 1;
		short r = NUtil.toShort(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort03() {
		Short s = 1;
		short r = NUtil.toShort(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort04() {
		Integer i = 1;
		short r = NUtil.toShort(i);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort05() {
		Long l = 1L;
		short r = NUtil.toShort(l);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort06() {
		BigDecimal b = new BigDecimal(1);
		short r = NUtil.toShort(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort07() {
		Float f = 1f;
		short r = NUtil.toShort(f);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort08() {
		Double d = 1d;
		short r = NUtil.toShort(d);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort09() {
		String s = "1";
		short r = NUtil.toShort(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToShort10() {
		Boolean b = true;
		short r = NUtil.toShort(b);
		Assert.assertEquals(1, r);
		b = false;
		r = NUtil.toShort(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToShort11() {
		String s = "";
		short r = NUtil.toShort(s);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToShort12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toShort(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToShort13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toShort(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}


	/* toInt(Obj) */
	@Test
	public void testToInt01() {
		Byte b = null;
		int r = NUtil.toInt(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToInt02() {
		Byte b = 1;
		int r = NUtil.toInt(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt03() {
		Short s = 1;
		int r = NUtil.toInt(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt04() {
		Integer i = 1;
		int r = NUtil.toInt(i);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt05() {
		Long l = 1L;
		int r = NUtil.toInt(l);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt06() {
		BigDecimal b = new BigDecimal(1);
		int r = NUtil.toInt(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt07() {
		Float f = 1f;
		int r = NUtil.toInt(f);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt08() {
		Double d = 1d;
		int r = NUtil.toInt(d);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt09() {
		String s = "1";
		int r = NUtil.toInt(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToInt10() {
		Boolean b = true;
		int r = NUtil.toInt(b);
		Assert.assertEquals(1, r);
		b = false;
		r = NUtil.toInt(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToInt11() {
		String s = "";
		int r = NUtil.toInt(s);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToInt12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toInt(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToInt13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toInt(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}


	/* toLong(Obj) */
	@Test
	public void testToLong01() {
		Byte b = null;
		long r = NUtil.toLong(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToLong02() {
		Byte b = 1;
		long r = NUtil.toLong(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong03() {
		Short s = 1;
		long r = NUtil.toLong(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong04() {
		Integer i = 1;
		long r = NUtil.toLong(i);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong05() {
		Long l = 1L;
		long r = NUtil.toLong(l);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong06() {
		BigDecimal b = new BigDecimal(1);
		long r = NUtil.toLong(b);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong07() {
		Float f = 1f;
		long r = NUtil.toLong(f);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong08() {
		Double d = 1d;
		long r = NUtil.toLong(d);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong09() {
		String s = "1";
		long r = NUtil.toLong(s);
		Assert.assertEquals(1, r);
	}
	@Test
	public void testToLong10() {
		Boolean b = true;
		long r = NUtil.toLong(b);
		Assert.assertEquals(1, r);
		b = false;
		r = NUtil.toLong(b);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToLong11() {
		String s = "";
		long r = NUtil.toLong(s);
		Assert.assertEquals(0, r);
	}
	@Test
	public void testToLong12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toLong(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToLong13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toLong(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}


	/* toFloat(Obj) */
	@Test
	public void testToFloat01() {
		Byte b = null;
		float r = NUtil.toFloat(b);
		Assert.assertTrue(new Float(0f).equals(r));
	}
	@Test
	public void testToFloat02() {
		Byte b = 1;
		float r = NUtil.toFloat(b);
		Assert.assertTrue(new Float(1f).equals(r));
	}
	@Test
	public void testToFloat03() {
		Short s = 1;
		float r = NUtil.toFloat(s);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat04() {
		Integer i = 1;
		float r = NUtil.toFloat(i);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat05() {
		Long l = 1L;
		float r = NUtil.toFloat(l);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat06() {
		BigDecimal b = new BigDecimal(1);
		float r = NUtil.toFloat(b);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat07() {
		Float f = 1f;
		float r = NUtil.toFloat(f);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat08() {
		Double d = 1d;
		float r = NUtil.toFloat(d);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat09() {
		String s = "1";
		float r = NUtil.toFloat(s);
		Assert.assertTrue(new Float(1).equals(r));
	}
	@Test
	public void testToFloat10() {
		Boolean b = true;
		float r = NUtil.toFloat(b);
		Assert.assertTrue(new Float(1).equals(r));
		b = false;
		r = NUtil.toFloat(b);
		Assert.assertTrue(new Float(0).equals(r));
	}
	@Test
	public void testToFloat11() {
		String s = "";
		float r = NUtil.toFloat(s);
		Assert.assertTrue(new Float(0).equals(r));
	}
	@Test
	public void testToFloat12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toFloat(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToFloat13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toFloat(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}


	/* toDouble(Obj) */
	@Test
	public void testToDouble01() {
		Byte b = null;
		double r = NUtil.toDouble(b);
		Assert.assertTrue(new Double(0d).equals(r));
	}
	@Test
	public void testToDouble02() {
		Byte b = 1;
		double r = NUtil.toDouble(b);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble03() {
		Short s = 1;
		double r = NUtil.toDouble(s);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble04() {
		Integer i = 1;
		double r = NUtil.toDouble(i);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble05() {
		Long l = 1L;
		double r = NUtil.toDouble(l);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble06() {
		BigDecimal b = new BigDecimal(1);
		double r = NUtil.toDouble(b);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble07() {
		Float f = 1f;
		double r = NUtil.toDouble(f);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble08() {
		Double d = 1d;
		double r = NUtil.toDouble(d);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble09() {
		String s = "1";
		double r = NUtil.toDouble(s);
		Assert.assertTrue(new Double(1d).equals(r));
	}
	@Test
	public void testToDouble10() {
		Boolean b = true;
		double r = NUtil.toDouble(b);
		Assert.assertTrue(new Double(1d).equals(r));
		b = false;
		r = NUtil.toDouble(b);
		Assert.assertTrue(new Double(0d).equals(r));
	}
	@Test
	public void testToDouble11() {
		String s = "";
		double r = NUtil.toDouble(s);
		Assert.assertTrue(new Double(0d).equals(r));
	}
	@Test
	public void testToDouble12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toDouble(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToDouble13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toDouble(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}


	/* toDecimal(Obj) */
	@Test
	public void testToDecimal01() {
		Byte b = null;
		BigDecimal r = NUtil.toDecimal(b);
		Assert.assertEquals(0, new BigDecimal(0).compareTo(r));
	}
	@Test
	public void testToDecimal02() {
		Byte b = 1;
		BigDecimal r = NUtil.toDecimal(b);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal03() {
		Short s = 1;
		BigDecimal r = NUtil.toDecimal(s);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal04() {
		Integer i = 1;
		BigDecimal r = NUtil.toDecimal(i);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal05() {
		Long l = 1L;
		BigDecimal r = NUtil.toDecimal(l);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal06() {
		BigDecimal b = new BigDecimal(1);
		BigDecimal r = NUtil.toDecimal(b);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal07() {
		Float f = 1f;
		BigDecimal r = NUtil.toDecimal(f);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal08() {
		Double d = 1d;
		BigDecimal r = NUtil.toDecimal(d);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal09() {
		String s = "1";
		BigDecimal r = NUtil.toDecimal(s);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
	}
	@Test
	public void testToDecimal10() {
		Boolean b = true;
		BigDecimal r = NUtil.toDecimal(b);
		Assert.assertEquals(0, new BigDecimal(1).compareTo(r));
		b = false;
		r = NUtil.toDecimal(b);
		Assert.assertEquals(0, new BigDecimal(0).compareTo(r));
	}
	@Test
	public void testToDecimal11() {
		String s = "";
		BigDecimal r = NUtil.toDecimal(s);
		Assert.assertEquals(0, new BigDecimal(0).compareTo(r));
	}
	@Test
	public void testToDecimal12() {
		String s = "a";
		boolean r = false;
		try {
			NUtil.toDecimal(s);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
	@Test
	public void testToDecimal13() {
		Date d = new Date();
		boolean r = false;
		try {
			NUtil.toDecimal(d);
		} catch (NumberFormatException e) {
			r = true;
		}
		Assert.assertTrue(r);
	}
}
