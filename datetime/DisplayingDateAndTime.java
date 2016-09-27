// datetime/DisplayingDateAndTime.java
package datetime;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Problem Description: 
 * >> How to display current date and time? 
 * Solution: 
 * >> This example shows how to display the current date and time 
 * >> using Calender.getInstance() method of Calender class and fmt.format() method of Formatter class.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayingDateAndTime {

    /**
     * DisplayingDateAndTime Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tc", cal);
        System.out.println(fmt);
    }

}
