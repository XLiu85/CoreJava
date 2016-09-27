// datetime/DisplayHourAndMinute.java
package datetime;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Problem Description:
 * >> How to display hour and minute (current time)?
 * Solution:
 * >> This example demonstrates how to display the hour and minute of that moment by 
 * >> using Calender.getInstance() of Calender class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayHourAndMinute {

    /**
     * DisplayHourAndMinute Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
    }

}
