package jp.co.kunisys.member.common.util;

import java.time.LocalDateTime;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link DfUtil}のテストクラス
 */
public class DfUtilTest {

	/**
	 * {@link DfUtil#toY(Object)}のテスト
	 */
	@Test
	public void testToY01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016", DfUtil.toY(date));
	}
	@Test
	public void testToY02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016", DfUtil.toY(ldt));
	}
	@Test
	public void testToY03() {
		Assert.assertNull(DfUtil.toY(null));
	}

	/**
	 * {@link DfUtil#toJy(Object)}のテスト
	 */
	@Test
	public void testToJy01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016年", DfUtil.toJy(date));
	}
	@Test
	public void testToJy02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016年", DfUtil.toJy(ldt));
	}
	@Test
	public void testToJy03() {
		Assert.assertNull(DfUtil.toJy(null));
	}

	/**
	 * {@link DfUtil#toYm(Object)}のテスト
	 */
	@Test
	public void testToYm01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("201602", DfUtil.toYm(date));
	}
	@Test
	public void testToYm02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("201602", DfUtil.toYm(ldt));
	}
	@Test
	public void testToYm03() {
		Assert.assertNull(DfUtil.toYm(null));
	}

	/**
	 * {@link DfUtil#toSym(Object)}のテスト
	 */
	@Test
	public void testToSym01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016/02", DfUtil.toSym(date));
	}
	@Test
	public void testToSym02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016/02", DfUtil.toSym(ldt));
	}
	@Test
	public void testToSym03() {
		Assert.assertNull(DfUtil.toSym(null));
	}

	/**
	 * {@link DfUtil#toSymZ(Object)}のテスト
	 */
	@Test
	public void testToSymZ01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016/2", DfUtil.toSymZ(date));
	}
	@Test
	public void testToSymZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016/2", DfUtil.toSymZ(ldt));
	}
	@Test
	public void testToSymZ03() {
		Assert.assertNull(DfUtil.toSymZ(null));
	}

	/**
	 * {@link DfUtil#toJym(Object)}のテスト
	 */
	@Test
	public void testToJym01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016年02月", DfUtil.toJym(date));
	}
	@Test
	public void testToJym02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016年02月", DfUtil.toJym(ldt));
	}
	@Test
	public void testToJym03() {
		Assert.assertNull(DfUtil.toJym(null));
	}

	/**
	 * {@link DfUtil#toJymZ(Object)}のテスト
	 */
	@Test
	public void testToJymZ01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016年2月", DfUtil.toJymZ(date));
	}
	@Test
	public void testToJymZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016年2月", DfUtil.toJymZ(ldt));
	}
	@Test
	public void testToJymZ03() {
		Assert.assertNull(DfUtil.toJymZ(null));
	}

	/**
	 * {@link DfUtil#toYmd(Object)}のテスト
	 */
	@Test
	public void testToYmd01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("20160203", DfUtil.toYmd(date));
	}
	@Test
	public void testToYmd02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("20160203", DfUtil.toYmd(ldt));
	}
	@Test
	public void testToYmd03() {
		Assert.assertNull(DfUtil.toYmd(null));
	}

	/**
	 * {@link DfUtil#toSymd(Object)}のテスト
	 */
	@Test
	public void testToSymd01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016/02/03", DfUtil.toSymd(date));
	}
	@Test
	public void testToSymd02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016/02/03", DfUtil.toSymd(ldt));
	}
	@Test
	public void testToSymd03() {
		Assert.assertNull(DfUtil.toSymd(null));
	}

	/**
	 * {@link DfUtil#toSymdZ(Object)}のテスト
	 */
	@Test
	public void testToSymdZ01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016/2/3", DfUtil.toSymdZ(date));
	}
	@Test
	public void testToSymdZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016/2/3", DfUtil.toSymdZ(ldt));
	}
	@Test
	public void testToSymdZ03() {
		Assert.assertNull(DfUtil.toSymdZ(null));
	}

	/**
	 * {@link DfUtil#toJymd(Object)}のテスト
	 */
	@Test
	public void testToJymd01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016年02月03日", DfUtil.toJymd(date));
	}
	@Test
	public void testToJymd02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016年02月03日", DfUtil.toJymd(ldt));
	}
	@Test
	public void testToJymd03() {
		Assert.assertNull(DfUtil.toJymd(null));
	}

	/**
	 * {@link DfUtil#toJymdZ(Object)}のテスト
	 */
	@Test
	public void testToJymdZ01() {
		Date date = DUtil.toDate(2016, 2, 3);
		Assert.assertEquals("2016年2月3日", DfUtil.toJymdZ(date));
	}
	@Test
	public void testToJymdZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5);
		Assert.assertEquals("2016年2月3日", DfUtil.toJymdZ(ldt));
	}
	@Test
	public void testToJymdZ03() {
		Assert.assertNull(DfUtil.toJymdZ(null));
	}

	/**
	 * {@link DfUtil#toSymdhm(Object)}のテスト
	 */
	@Test
	public void testToSymdhm01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016/02/03 04:05", DfUtil.toSymdhm(date));
	}
	@Test
	public void testToSymdhm02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016/02/03 04:05", DfUtil.toSymdhm(ldt));
	}
	@Test
	public void testToSymdhm03() {
		Assert.assertNull(DfUtil.toSymdhm(null));
	}

	/**
	 * {@link DfUtil#toSymdhmZ(Object)}のテスト
	 */
	@Test
	public void testToSymdhmZ01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016/2/3 4:05", DfUtil.toSymdhmZ(date));
	}
	@Test
	public void testToSymdhmZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016/2/3 4:05", DfUtil.toSymdhmZ(ldt));
	}
	@Test
	public void testToSymdhmZ03() {
		Assert.assertNull(DfUtil.toSymdhmZ(null));
	}

	/**
	 * {@link DfUtil#toJymdhm(Object)}のテスト
	 */
	@Test
	public void testToJymdhm01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年02月03日 04時05分", DfUtil.toJymdhm(date));
	}
	@Test
	public void testToJymdhm02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年02月03日 04時05分", DfUtil.toJymdhm(ldt));
	}
	@Test
	public void testToJymdhm03() {
		Assert.assertNull(DfUtil.toJymdhm(null));
	}

	/**
	 * {@link DfUtil#toJymdhmZ(Object)}のテスト
	 */
	@Test
	public void testToJymdhmZ01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年2月3日 4時05分", DfUtil.toJymdhmZ(date));
	}
	@Test
	public void testToJymdhmZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年2月3日 4時05分", DfUtil.toJymdhmZ(ldt));
	}
	@Test
	public void testToJymdhmZ03() {
		Assert.assertNull(DfUtil.toJymdhmZ(null));
	}

	/**
	 * {@link DfUtil#toJymdhmAp(Object)}のテスト
	 */
	@Test
	public void testToJymdhmAp01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年02月03日 午前 04時05分", DfUtil.toJymdhmAp(date));
	}
	@Test
	public void testToJymdhmAp02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年02月03日 午前 04時05分", DfUtil.toJymdhmAp(ldt));
	}
	@Test
	public void testToJymdhmAp03() {
		Assert.assertNull(DfUtil.toJymdhmAp(null));
	}

	/**
	 * {@link DfUtil#toJymdhmApZ(Object)}のテスト
	 */
	@Test
	public void testToJymdhmApZ01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年2月3日 午前 4時05分", DfUtil.toJymdhmApZ(date));
	}
	@Test
	public void testToJymdhmApZ02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("2016年2月3日 午前 4時05分", DfUtil.toJymdhmApZ(ldt));
	}
	@Test
	public void testToJymdhmApZ03() {
		Assert.assertNull(DfUtil.toJymdhmApZ(null));
	}

	/**
	 * {@link DfUtil#towSgengo(Object)}のテスト
	 */
	@Test
	public void testTowSgengo01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("H", DfUtil.towSgengo(date));
	}
	@Test
	public void testTowSgengo02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("H", DfUtil.towSgengo(ldt));
	}
	@Test
	public void testTowSgengo03() {
		Assert.assertNull(DfUtil.towSgengo(null));
	}

	/**
	 * {@link DfUtil#towJgengo(Object)}のテスト
	 */
	@Test
	public void testTowJgengo01() {
		Date date = DUtil.toDate(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成", DfUtil.towJgengo(date));
	}
	@Test
	public void testTowJgengo02() {
		LocalDateTime ldt = LocalDateTime.of(2016, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成", DfUtil.towJgengo(ldt));
	}
	@Test
	public void testTowJgengo03() {
		Assert.assertNull(DfUtil.towJgengo(null));
	}

	/**
	 * {@link DfUtil#towYear(Object)}のテスト
	 */
	@Test
	public void testTowYear01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("08", DfUtil.towYear(date));
	}
	@Test
	public void testTowYear02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("08", DfUtil.towYear(ldt));
	}
	@Test
	public void testTowYear03() {
		Assert.assertNull(DfUtil.towYear(null));
	}

	/**
	 * {@link DfUtil#towYearZ(Object)}のテスト
	 */
	@Test
	public void testTowYearZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("8", DfUtil.towYearZ(date));
	}
	@Test
	public void testTowYearZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("8", DfUtil.towYearZ(ldt));
	}
	@Test
	public void testTowYearZ03() {
		Assert.assertNull(DfUtil.towYearZ(null));
	}

	/**
	 * {@link DfUtil#towSy(Object)}のテスト
	 */
	@Test
	public void testTowSy01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08", DfUtil.towSy(date));
	}
	@Test
	public void testTowSy02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08", DfUtil.towSy(ldt));
	}
	@Test
	public void testTowSy03() {
		Assert.assertNull(DfUtil.towSy(null));
	}

	/**
	 * {@link DfUtil#towSyZ(Object)}のテスト
	 */
	@Test
	public void testTowSyZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8", DfUtil.towSyZ(date));
	}
	@Test
	public void testTowSyZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8", DfUtil.towSyZ(ldt));
	}
	@Test
	public void testTowSyZ03() {
		Assert.assertNull(DfUtil.towSyZ(null));
	}

	/**
	 * {@link DfUtil#towJy(Object)}のテスト
	 */
	@Test
	public void testTowJy01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年", DfUtil.towJy(date));
	}
	@Test
	public void testTowJy02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年", DfUtil.towJy(ldt));
	}
	@Test
	public void testTowJy03() {
		Assert.assertNull(DfUtil.towJy(null));
	}

	/**
	 * {@link DfUtil#towJyZ(Object)}のテスト
	 */
	@Test
	public void testTowJyZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年", DfUtil.towJyZ(date));
	}
	@Test
	public void testTowJyZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年", DfUtil.towJyZ(ldt));
	}
	@Test
	public void testTowJyZ03() {
		Assert.assertNull(DfUtil.towJyZ(null));
	}

	/**
	 * {@link DfUtil#towSym(Object)}のテスト
	 */
	@Test
	public void testTowSym01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08/02", DfUtil.towSym(date));
	}
	@Test
	public void testTowSym02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08/02", DfUtil.towSym(ldt));
	}
	@Test
	public void testTowSym03() {
		Assert.assertNull(DfUtil.towSym(null));
	}

	/**
	 * {@link DfUtil#towSymZ(Object)}のテスト
	 */
	@Test
	public void testTowSymZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8/2", DfUtil.towSymZ(date));
	}
	@Test
	public void testTowSymZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8/2", DfUtil.towSymZ(ldt));
	}
	@Test
	public void testTowSymZ03() {
		Assert.assertNull(DfUtil.towSymZ(null));
	}

	/**
	 * {@link DfUtil#towJym(Object)}のテスト
	 */
	@Test
	public void testTowJym01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月", DfUtil.towJym(date));
	}
	@Test
	public void testTowJym02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月", DfUtil.towJym(ldt));
	}
	@Test
	public void testTowJym03() {
		Assert.assertNull(DfUtil.towJym(null));
	}

	/**
	 * {@link DfUtil#towJymZ(Object)}のテスト
	 */
	@Test
	public void testTowJymZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月", DfUtil.towJymZ(date));
	}
	@Test
	public void testTowJymZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月", DfUtil.towJymZ(ldt));
	}
	@Test
	public void testTowJymZ03() {
		Assert.assertNull(DfUtil.towJymZ(null));
	}

	/**
	 * {@link DfUtil#towSymd(Object)}のテスト
	 */
	@Test
	public void testTowSymd01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08/02/03", DfUtil.towSymd(date));
	}
	@Test
	public void testTowSymd02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08/02/03", DfUtil.towSymd(ldt));
	}
	@Test
	public void testTowSymd03() {
		Assert.assertNull(DfUtil.towSymd(null));
	}

	/**
	 * {@link DfUtil#towSymdZ(Object)}のテスト
	 */
	@Test
	public void testTowSymdZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8/2/3", DfUtil.towSymdZ(date));
	}
	@Test
	public void testTowSymdZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8/2/3", DfUtil.towSymdZ(ldt));
	}
	@Test
	public void testTowSymdZ03() {
		Assert.assertNull(DfUtil.towSymdZ(null));
	}

	/**
	 * {@link DfUtil#towJymd(Object)}のテスト
	 */
	@Test
	public void testTowJymd01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月03日", DfUtil.towJymd(date));
	}
	@Test
	public void testTowJymd02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月03日", DfUtil.towJymd(ldt));
	}
	@Test
	public void testTowJymd03() {
		Assert.assertNull(DfUtil.towJymd(null));
	}

	/**
	 * {@link DfUtil#towJymdZ(Object)}のテスト
	 */
	@Test
	public void testTowJymdZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月3日", DfUtil.towJymdZ(date));
	}
	@Test
	public void testTowJymdZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月3日", DfUtil.towJymdZ(ldt));
	}
	@Test
	public void testTowJymdZ03() {
		Assert.assertNull(DfUtil.towJymdZ(null));
	}

	/**
	 * {@link DfUtil#towSymdhm(Object)}のテスト
	 */
	@Test
	public void testTowSymdhm01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08/02/03 04:05", DfUtil.towSymdhm(date));
	}
	@Test
	public void testTowSymdhm02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H08/02/03 04:05", DfUtil.towSymdhm(ldt));
	}
	@Test
	public void testTowSymdhm03() {
		Assert.assertNull(DfUtil.towSymdhm(null));
	}

	/**
	 * {@link DfUtil#towSymdhmZ(Object)}のテスト
	 */
	@Test
	public void testTowSymdhmZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8/2/3 4:05", DfUtil.towSymdhmZ(date));
	}
	@Test
	public void testTowSymdhmZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("H8/2/3 4:05", DfUtil.towSymdhmZ(ldt));
	}
	@Test
	public void testTowSymdhmZ03() {
		Assert.assertNull(DfUtil.towSymdhmZ(null));
	}

	/**
	 * {@link DfUtil#towJymdhm(Object)}のテスト
	 */
	@Test
	public void testTowJymdhm01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月03日 04時05分", DfUtil.towJymdhm(date));
	}
	@Test
	public void testTowJymdhm02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月03日 04時05分", DfUtil.towJymdhm(ldt));
	}
	@Test
	public void testTowJymdhm03() {
		Assert.assertNull(DfUtil.towJymdhm(null));
	}

	/**
	 * {@link DfUtil#towJymdhmZ(Object)}のテスト
	 */
	@Test
	public void testTowJymdhmZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月3日 4時05分", DfUtil.towJymdhmZ(date));
	}
	@Test
	public void testTowJymdhmZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月3日 4時05分", DfUtil.towJymdhmZ(ldt));
	}
	@Test
	public void testTowJymdhmZ03() {
		Assert.assertNull(DfUtil.towJymdhmZ(null));
	}

	/**
	 * {@link DfUtil#towJymdhmAp(Object)}のテスト
	 */
	@Test
	public void testTowJymdhmAp01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月03日 午前 04時05分", DfUtil.towJymdhmAp(date));
	}
	@Test
	public void testTowJymdhmAp02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成08年02月03日 午前 04時05分", DfUtil.towJymdhmAp(ldt));
	}
	@Test
	public void testTowJymdhmAp03() {
		Assert.assertNull(DfUtil.towJymdhmAp(null));
	}

	/**
	 * {@link DfUtil#towJymdhmApZ(Object)}のテスト
	 */
	@Test
	public void testTowJymdhmApZ01() {
		Date date = DUtil.toDate(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月3日 午前 4時05分", DfUtil.towJymdhmApZ(date));
	}
	@Test
	public void testTowJymdhmApZ02() {
		LocalDateTime ldt = LocalDateTime.of(1996, 2, 3, 4, 5, 6);
		Assert.assertEquals("平成8年2月3日 午前 4時05分", DfUtil.towJymdhmApZ(ldt));
	}
	@Test
	public void testTowJymdhmApZ03() {
		Assert.assertNull(DfUtil.towJymdhmApZ(null));
	}
}
