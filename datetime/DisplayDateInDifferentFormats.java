// datetime/DisplayDateInDifferentFormats.java
package datetime;

import java.text.DateFormat;
import java.util.Date;

/**
 * Problem Description:
 * >> How to display date in different formats ?
 * Solution:
 * >> This example displays the names of the weekdays in short form with the help of 
 * >> DateFormatSymbols().getWeekdays() method of DateFormatSymbols class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayDateInDifferentFormats {

    /**
     * DisplayDateInDifferentFormats Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dt = new Date(1000000000000L);

        DateFormat[] dtformat = new DateFormat[6];
        dtformat[0] = DateFormat.getInstance();
        dtformat[1] = DateFormat.getDateInstance();
        dtformat[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dtformat[3] = DateFormat.getDateInstance(DateFormat.FULL);
        dtformat[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dtformat[5] = DateFormat.getDateInstance(DateFormat.SHORT);

        for (DateFormat dateform : dtformat) {
            System.out.println(dateform.format(dt));
        }
    }

}
