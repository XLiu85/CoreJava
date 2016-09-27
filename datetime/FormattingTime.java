// datetime/FormattingTime.java
package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Problem Description: 
 * >> How to format time in AM-PM format? 
 * Solution: 
 * >> This example formats the time by using SimpleDateFormat("HH-mm-ss a") 
 * >> constructor and sdf.format(date) method of SimpleDateFormat class.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class FormattingTime {

    /**
     * FormattingTime Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }

}
