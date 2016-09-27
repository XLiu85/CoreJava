// datetime/ConvertStringToLocalDate.java
package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * How to convert a String to the new Java 8 Date API
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class ConvertStringToLocalDate {

    /**
     * ConvertStringToLocalDate Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        newDate1();
        newDate2();
        newDate3();
        newDate4();
        newDate5();
        newDate6();
        newDate7();
    }

    /**
     * If the String is formatted like ISO_LOCAL_DATE, you can parse the String
     * directly, no need conversion
     */
    private static void newDate1() {
        String date = "2016-08-16";
        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
    }

    private static void newDate2() {
        String date = "16-Aug-2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);  //default, print ISO_LOCAL_DATE
        System.out.println(formatter.format(localDate));
    }

    private static void newDate3() {
        String date = "16/08/2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);
        System.out.println(formatter.format(localDate));
    }

    private static void newDate4() {
        String date = "Tue, Aug 16 2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM d yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);
        System.out.println(formatter.format(localDate));
    }

    private static void newDate5() {
        String date = "Tuesday, Aug 16, 2016 12:10:56 PM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);

        System.out.println(localDateTime);
        System.out.println(formatter.format(localDateTime));
    }

    private static void newDate6() {
        String dateInString = "2016-08-16T15:23:01Z";

        Instant instant = Instant.parse(dateInString);
        System.out.println("Instant : " + instant);

        //get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
        //get localdate
        System.out.println("LocalDate : " + result.toLocalDate());

        //get date time + timezone
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime);

        //get date time + timezone
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);
    }

    private static void newDate7() {
        String date = "2016-08-16T10:15:30+08:00";

        ZonedDateTime result = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ZonedDateTime : " + result);
        System.out.println("TimeZone : " + result.getZone());

        LocalDate localDate = result.toLocalDate();
        System.out.println("LocalDate : " + localDate);
    }
}
