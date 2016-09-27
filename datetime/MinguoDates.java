// datetime/MinguoDate.java
package datetime;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;

/**
 * Review a full example to convert a LocalDate to MinguoDate
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class MinguoDates {

    /**
     * MinguoDate Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LocalDate -> MinguoDate
        System.out.println("Example 1...");

        LocalDate localDate = LocalDate.of(1912, 1, 1);
        MinguoDate minguo = MinguoDate.from(localDate);
        System.out.println("LocalDate : " + localDate); //1912-01-01
        System.out.println("MinguoDate : " + minguo);   //1-01-01

        // MinguoDate -> LocalDate
        System.out.println("\nExample 2...");

        MinguoDate minguo2 = MinguoDate.of(105, 8, 24);
        
        // LocalDate localDate = LocalDate.ofEpochDay(minguo2.toEpochDay());
        LocalDate localDate2 = LocalDate.from(minguo2);
        System.out.println("MinguoDate : " + minguo2);    //105-08-24
        System.out.println("LocalDate : " + localDate2);  //2016-08-24
    }

}
