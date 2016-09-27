// datetime/DisplayingWeekdays.java
package datetime;

import java.text.DateFormatSymbols;

/**
 * Problem Description:
 * >> How to display name of the weekdays ?
 * Solution:
 * >> This example displays the names of the weekdays in short form with the help of 
 * >> DateFormatSymbols().getWeekdays() method of DateFormatSymbols class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayingWeekdays {

    /**
     * DisplayingWeekdays Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] weekdays = new DateFormatSymbols().getWeekdays();
        for (int i = 2; i < (weekdays.length - 1); i++) {
            String weekday = weekdays[i];
            System.out.println("weekday = " + weekday);
        }
    }

}
