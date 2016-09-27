// datetime/FormattingMonths.java
package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Problem Description: 
 * >> How to format time in MMMM format? 
 * Solution: 
 * >> This example formats the month with the help of SimpleDateFormat('MMMM') constructor 
 * >> and sdf.format(date) method of SimpleDateFormat class.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class FormattingMonths {

    /**
     * FormattingMonths Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        System.out.println("Current Month in MMMM format : " + sdf.format(date));
    }

}
