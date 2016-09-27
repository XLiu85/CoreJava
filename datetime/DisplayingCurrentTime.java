// datetime/DisplayingCurrentTime.java
package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Problem Description:
 * >> How to format time in 24 hour format?
 * Solution:
 * >> This example formats the time into 24 hour format (00:00-24:00) 
 * >> by using sdf.format(date) method of SimpleDateFormat class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayingCurrentTime {

    /**
     * DisplayingCurrentTime Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("hour in h format : " + sdf.format(date));
    }
    
}
