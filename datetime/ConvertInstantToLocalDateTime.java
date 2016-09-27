// datetime/ConvertInstantToLocalDateTime.java
package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

/**
 * Java 8 show you how to convert from Instant to LocalDateTime
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class ConvertInstantToLocalDateTime {

    /**
     * ConvertInstantToLocalDateTime Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        instantExample1();
        instantExample2();
    }

    private static void instantExample1() {
        Instant instant = Instant.now();
        System.out.println("Instant : " + instant);

        //Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        System.out.println("LocalDateTime : " + ldt);
    }

    private static void instantExample2() {
        // Hard code a date time
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 17, 10);
        System.out.println("LocalDateTime : " + dateTime);

        // Convert LocalDateTime to Instant, UTC+0
        Instant instant = dateTime.toInstant(ZoneOffset.UTC);
        System.out.println("Instant : " + instant);
    }

}
