// datetime/ConvertDateToLocalDateAndLocalDateTime.java
package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * The java.util.Date has no concept of time zone, and only represents the
 * number of seconds passed since the Unix epoch time – 1970-01-01T00:00:00Z
 * (midnight at the start of January 1, 1970 GMT/UTC)
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class ConvertDateToLocalDateAndLocalDateTime {

    /**
     * ConvertDateToLocalDateAndLocalDateTime Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Asia/Kuala_Lumpur +8
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("System Default TimeZone : " + defaultZoneId);

        //toString() append +8 automatically.
        Date date = new Date();
        System.out.println("date : " + date);

        //1. Convert Date -> Instant
        Instant instant = date.toInstant();
        System.out.println("instant : " + instant); //Zone : UTC+0

        //2. Instant + system default time zone + toLocalDate() = LocalDate
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
        System.out.println("localDate : " + localDate);

        //3. Instant + system default time zone + toLocalDateTime() = LocalDateTime
        LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
        System.out.println("localDateTime : " + localDateTime);

        //4. Instant + system default time zone = ZonedDateTime
        ZonedDateTime zonedDateTime = instant.atZone(defaultZoneId);
        System.out.println("zonedDateTime : " + zonedDateTime);
    }

}
