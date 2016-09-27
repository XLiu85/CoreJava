// datetime/ConvertInstantToZonedDateTime.java
package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java 8 show you how to convert from Instant to ZonedDateTime
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class ConvertInstantToZonedDateTime {

    /**
     * ConvertInstantToZonedDateTime Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        instantZonedDateTime1();
        instantZonedDateTime2();
    }

    /**
     * Example to convert a Instant UTC+0 to a Japan ZonedDateTime UTC+9
     */
    private static void instantZonedDateTime1() {
        // Z = UTC+0
        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        // Japan = UTC+9
        ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("ZonedDateTime : " + jpTime);
        System.out.println("OffSet : " + jpTime.getOffset());
    }

    /**
     * Convert the Japan ZonedDateTime UTC+9 back to a Instant UTC+0/Z, review
     * the result, the offset is taken care automatically.
     */
    private static void instantZonedDateTime2() {
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 57, 38);

        // UTC+9
        ZonedDateTime jpTime = dateTime.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime : " + jpTime);

        // Convert to instant UTC+0/Z , java.time helps to reduce 9 hours
        Instant instant = jpTime.toInstant();
        System.out.println("Instant : " + instant);
    }
}
