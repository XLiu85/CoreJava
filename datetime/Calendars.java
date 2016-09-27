// datetime/Calendars.java
package datetime;

import java.text.Format;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 次の例ではCalendarでの時間の持ち方を見るために、同じタイムラインを持つCalendarでタイムゾーンを変えた場合を見ています。
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class Calendars {

    /**
     * Calendars Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calendarsSample01();
        calendarsSample02();
        calendarsSample03();
        calendarsSample04();
        calendarsSample05();
        calendarsSample06();
        try {
            calendarsSample07();
        } catch (ParseException ex) {
            Logger.getLogger(Calendars.class.getName()).log(Level.SEVERE, null, ex);
        }
        calendarsSample08();
    }

    private static void calendarsSample01() {
        Date date = new Date();
        long timeline = date.getTime(); // タイムラインの取得
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("calendar=" + calendar);

        System.out.println();
        System.out.println("タイムゾーンを変更");
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
        calendar2.setTimeInMillis(timeline); // 同じタイムラインを設定
        System.out.println("calendar2=" + calendar2);
    }

    private static void calendarsSample02() {
        Date date = new Date();
        long timeline = date.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("date.getTime()=" + date.getTime());
        System.out.println("date=" + date);

        System.out.println();
        System.out.println("タイムゾーンを変更");
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
        calendar2.setTimeInMillis(timeline);
        Date date2 = calendar2.getTime();
        System.out.println("date2.getTime()=" + date2.getTime());
        System.out.println("date2=" + date2);
    }

    private static void calendarsSample03() {
        // Date → Instant
        System.out.println("Date → Instant");

        Date date1 = new Date();
        Instant instant1 = date1.toInstant();

        System.out.println("date1=" + date1);
        System.out.println("instant1=" + instant1);
        System.out.println("date1.getTime()=" + date1.getTime());
        System.out.println("instant1.toEpochMilli()=" + instant1.toEpochMilli());

        // Instant → Date
        System.out.println("Instant → Date");

        Instant instant2 = Instant.now();
        Date date2 = Date.from(instant2);

        System.out.println("instant2=" + instant2);
        System.out.println("date2=" + date2);
        System.out.println("instant2.toEpochMilli()=" + instant2.toEpochMilli());
        System.out.println("date2.getTime()=" + date2.getTime());

        // Calendar → Instant
        System.out.println("Calendar → Instant");

        Calendar calendar = Calendar.getInstance();
        Instant instant3 = calendar.toInstant();

        System.out.println("calendar=" + calendar);
        System.out.println("instant3=" + instant3);
        System.out.println("calendar.getTimeInMillis()=" + calendar.getTimeInMillis());
        System.out.println("instant3.toEpochMilli()=" + instant3.toEpochMilli());
    }

    private static void calendarsSample04() {
        // GregorianCalendar → ZonedDateTime
        System.out.println("GregorianCalendar → ZonedDateTime");

        GregorianCalendar calendar2 = (GregorianCalendar) GregorianCalendar.getInstance();
        ZonedDateTime zonedDateTime = calendar2.toZonedDateTime();

        System.out.println("calendar2=" + calendar2);
        System.out.println("zonedDateTime=" + zonedDateTime);

        System.out.println();

        // ZonedDateTime → GregorianCalendar
        System.out.println("ZonedDateTime → GregorianCalendar");

        GregorianCalendar calendar3 = GregorianCalendar.from(zonedDateTime);

        System.out.println("zonedDateTime=" + zonedDateTime);
        System.out.println("calendar3=" + calendar3);
    }

    private static void calendarsSample05() {
        // TimeZone → ZoneId
        System.out.println("TimeZone → ZoneId");

        TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
        ZoneId zoneId1 = timeZone1.toZoneId();

        System.out.println("timeZone1=" + timeZone1);
        System.out.println("zoneId1=" + zoneId1);

        System.out.println();

        // ZoneId → TimeZone
        System.out.println("ZoneId → TimeZone");

        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        TimeZone timeZone2 = TimeZone.getTimeZone(zoneId2);

        System.out.println("timeZone2=" + timeZone2);
        System.out.println("zoneId2=" + zoneId2);

        System.out.println();

        // ZoneOffset → TimeZone
        System.out.println("ZoneId → TimeZone");

        ZoneOffset zoneOffset = ZoneOffset.of("+01:00");
        TimeZone timeZone4 = TimeZone.getTimeZone(zoneOffset);

        System.out.println("timeZone4=" + timeZone4);
        System.out.println("zoneOffset=" + zoneOffset);
    }

    private static void calendarsSample06() {
        LocalDate localDate = LocalDate.of(2014, 1, 1);
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d");
        Format format = formatter.toFormat();
        System.out.println(format);
        System.out.println("format.format(localDate)=" + format.format(localDate));
        // System.out.println("format.format(date)=" + format.format(date)); // 例外が発生する
    }

    private static void calendarsSample07() throws ParseException {
        // DateTimeFormatter → Formatへの変換
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d");
        Format format = formatter.toFormat();

        // Formatから文字列の解析
        Object parsedObject = format.parseObject("2014/2/2");
        System.out.println("parsedObject=" + parsedObject);
        System.out.println("parsedObject.getClass()=" + parsedObject.getClass());

        // Parsed → Date-Time API
        TemporalAccessor temporalAccessor = (TemporalAccessor) parsedObject;
        LocalDate converted = LocalDate.from(temporalAccessor);
        System.out.println("converted=" + converted);
        System.out.println("converted.getClass()=" + converted.getClass());

        // TemporalQueryを使って直接Date-Time APIのクラスに変換
        Format format2 = formatter.toFormat(LocalDate::from);
        Object parsedObject2 = format2.parseObject("2014/3/3");
        System.out.println("parsedObject2=" + parsedObject2);
        System.out.println("parsedObject2.getClass()=" + parsedObject2.getClass());
    }

    private static void calendarsSample08() {
        System.out.println("LocalDateTimeの例");
        LocalDateTime localDateTime1 = LocalDateTime.of(2014, 1, 1, 0, 0, 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2014, 2, 28, 3, 4, 5, 6);
        System.out.println("localDateTime1=" + localDateTime1);
        System.out.println("localDateTime2=" + localDateTime2);

        System.out.println();
        System.out.println("ZonedDateTimeの例");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime1, ZoneId.of("UTC"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, ZoneId.systemDefault());
        System.out.println("zonedDateTime1=" + zonedDateTime1);
        System.out.println("zonedDateTime2=" + zonedDateTime2);

        System.out.println();
        System.out.println("日数の計算");
        Period period = Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate());
        System.out.println("Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate())=" + period);

        long days = ChronoUnit.DAYS.between(localDateTime1, localDateTime2);
        System.out.println("ChronoUnit.DAYS.between(localDateTime1, localDateTime2)=" + days);
        System.out.println();
        System.out.println("Formatterの例");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d HH:mm:ss");
        System.out.println("formatter.format(localDateTime1)=" + formatter.format(localDateTime1));
        System.out.println("formatter.format(localDateTime2)=" + formatter.format(localDateTime2));
    }

}
