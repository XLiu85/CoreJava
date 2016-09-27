// datetime/AddTimeToDate.java
package datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * Problem Description:
 * >> How to add time(Days, years , seconds) to Date?
 * Solution:
 * >> The following examples shows us how to add time to a date using add() method of Calender.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class AddTimeToDate {

    /**
     * AddTimeToDate Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);
        System.out.println("today is " + d1.toString());
        cl.add(Calendar.MONTH, 1);
        System.out.println("date after a month will be " + cl.getTime().toString());
        cl.add(Calendar.HOUR, 70);
        System.out.println("date after 7 hrs will be " + cl.getTime().toString());
        cl.add(Calendar.YEAR, 3);
        System.out.println("date after 3 years will be " + cl.getTime().toString());
    }

}
