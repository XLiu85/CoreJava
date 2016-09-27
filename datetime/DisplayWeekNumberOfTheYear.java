// datetime/DisplayWeekNumberOfTheYear.java
package datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * Problem Description:
 * >> How to find which week of the year, month?
 * Solution:
 * >> The following example displays week no of the year & month.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayWeekNumberOfTheYear {

    /**
     * DisplayWeekNumberOfTheYear Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);
        System.out.println("today is " + Calendar.WEEK_OF_YEAR + " week of the year");
        System.out.println("today is a " + Calendar.DAY_OF_MONTH + " month of the year");
        System.out.println("today is a " + Calendar.WEEK_OF_MONTH + " week of the month");
    }

}
