// datetime/HijrahDateCalculateTheRamadanDate.java
package datetime;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * Full example to calculate the start and end of the Ramadan 2016
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class HijrahDateCalculateTheRamadanDate {

    /**
     * HijrahDateCalculateTheRamadanDate Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first day of Ramadan, 9th month
        HijrahDate ramadan = HijrahDate.now().with(ChronoField.DAY_OF_MONTH, 1).with(ChronoField.MONTH_OF_YEAR, 9);
        System.out.println("HijrahDate : " + ramadan);

        //HijrahDate -> LocalDate
        System.out.println("\n--- Ramandan 2016 ---");
        System.out.println("Start : " + LocalDate.from(ramadan));

        //until the end of the month
        System.out.println("End : " + LocalDate.from(ramadan.with(TemporalAdjusters.lastDayOfMonth())));
    }

}
