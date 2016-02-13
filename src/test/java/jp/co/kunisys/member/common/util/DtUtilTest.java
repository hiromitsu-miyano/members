package jp.co.kunisys.member.common.util;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link DtUtil}のテストクラス
 */
public class DtUtilTest {

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト01
	 */
	@Test
	public void testToLocalDateTime01() {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 1, 12, 13, 16, 17);
		Date d = cal.getTime();

		LocalDateTime ldt = DtUtil.toLocalDateTime(d);
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(13,   ldt.getHour());
		Assert.assertEquals(16,   ldt.getMinute());
		Assert.assertEquals(17,   ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト02
	 */
	@Test
	public void testToLocalDateTime02() {
		LocalDateTime d = LocalDateTime.of(2016, 2, 12, 13, 16, 17);

		LocalDateTime ldt = DtUtil.toLocalDateTime(d);
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(13,   ldt.getHour());
		Assert.assertEquals(16,   ldt.getMinute());
		Assert.assertEquals(17,   ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト03
	 */
	@Test
	public void testToLocalDateTime03() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("20160212");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト04
	 */
	@Test
	public void testToLocalDateTime04() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016/02/12");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト05
	 */
	@Test
	public void testToLocalDateTime05() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016年02月12日");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト06
	 */
	@Test
	public void testToLocalDateTime06() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016/2/12");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト07
	 */
	@Test
	public void testToLocalDateTime07() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016年2月12日");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト08
	 */
	@Test
	public void testToLocalDateTime08() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H280212");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト09
	 */
	@Test
	public void testToLocalDateTime09() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H28/02/12");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト10
	 */
	@Test
	public void testToLocalDateTime10() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H8/02/12");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト11
	 */
	@Test
	public void testToLocalDateTime11() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H08/02/12");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト12
	 */
	@Test
	public void testToLocalDateTime12() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("平成28年02月12日");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト13
	 */
	@Test
	public void testToLocalDateTime13() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("平成8年2月12日");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(0,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト14
	 */
	@Test
	public void testToLocalDateTime14() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016021201");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト15
	 */
	@Test
	public void testToLocalDateTime15() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016/02/12 01");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト16
	 */
	@Test
	public void testToLocalDateTime16() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016/2/3 1");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト17
	 */
	@Test
	public void testToLocalDateTime17() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016年02月03日 01時");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト18
	 */
	@Test
	public void testToLocalDateTime18() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016年2月3日 1時");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト19
	 */
	@Test
	public void testToLocalDateTime19() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H28020301");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト20
	 */
	@Test
	public void testToLocalDateTime20() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H08/02/03 01");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト21
	 */
	@Test
	public void testToLocalDateTime21() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H8/2/3 1");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト22
	 */
	@Test
	public void testToLocalDateTime22() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("平成08年02月03日 01時");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト23
	 */
	@Test
	public void testToLocalDateTime23() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("平成8年2月3日 1時");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(0,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト24
	 */
	@Test
	public void testToLocalDateTime24() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("201602120102");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト25
	 */
	@Test
	public void testToLocalDateTime25() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016/02/12 01:02");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト26
	 */
	@Test
	public void testToLocalDateTime26() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("2016/2/3 1:2");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト27
	 */
	@Test
	public void testToLocalDateTime27() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H2802030102");
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト28
	 */
	@Test
	public void testToLocalDateTime28() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H08/02/03 01:02");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト29
	 */
	@Test
	public void testToLocalDateTime29() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("H8/2/3 1:2");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト30
	 */
	@Test
	public void testToLocalDateTime30() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("平成08年02月03日 01時02分");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト31
	 */
	@Test
	public void testToLocalDateTime31() {
		LocalDateTime ldt = DtUtil.toLocalDateTime("平成8年2月3日 1時2分");
		Assert.assertEquals(1996, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(3,    ldt.getDayOfMonth());
		Assert.assertEquals(1,    ldt.getHour());
		Assert.assertEquals(2,    ldt.getMinute());
		Assert.assertEquals(0,    ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト32
	 */
	@Test
	public void testToLocalDateTime32() {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 1, 12, 13, 16, 17);
		java.sql.Timestamp d = new java.sql.Timestamp(cal.getTimeInMillis());

		LocalDateTime ldt = DtUtil.toLocalDateTime(d);
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(13,   ldt.getHour());
		Assert.assertEquals(16,   ldt.getMinute());
		Assert.assertEquals(17,   ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト33
	 */
	@Test
	public void testToLocalDateTime33() {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 1, 12, 13, 16, 17);
		java.sql.Date d = new java.sql.Date(cal.getTimeInMillis());

		LocalDateTime ldt = DtUtil.toLocalDateTime(d);
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(13,   ldt.getHour());
		Assert.assertEquals(16,   ldt.getMinute());
		Assert.assertEquals(17,   ldt.getSecond());
	}

	/**
	 * {@link DUtil#toLocalDateTime(Object)}のテスト34
	 */
	@Test
	public void testToLocalDateTime34() {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 1, 12, 13, 16, 17);

		LocalDateTime ldt = DtUtil.toLocalDateTime(cal.getTimeInMillis());
		Assert.assertEquals(2016, ldt.getYear());
		Assert.assertEquals(2,    ldt.getMonthValue());
		Assert.assertEquals(12,   ldt.getDayOfMonth());
		Assert.assertEquals(13,   ldt.getHour());
		Assert.assertEquals(16,   ldt.getMinute());
		Assert.assertEquals(17,   ldt.getSecond());
	}

}
