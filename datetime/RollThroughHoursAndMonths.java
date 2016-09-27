// datetime/RollThroughHoursAndMonths.java
package datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * Problem Description:
 * >> How to roll through hours & months?
 * Solution:
 * >> This example shows us how to roll through monrhs (without changing year) or 
 * >> hrs(without changing month or year) using roll() method of Class calender.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class RollThroughHoursAndMonths {

    /**
     * RollThroughHoursAndMonths Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);
        System.out.println("today is " + d1.toString());
        cl.roll(Calendar.MONTH, 100);
        System.out.println("date after a month will be " + cl.getTime().toString());
        cl.roll(Calendar.HOUR, 70);
        System.out.println("date after 7 hrs will be " + cl.getTime().toString());
    }

}
