// datetime/FormattingSeconds.java
package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Problem Description:
 * >> How to format seconds?
 * Solution:
 * >> This example formats the second by using SimpleDateFormat('ss') constructor 
 * >> and sdf.format(date) method of SimpleDateFormat class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class FormattingSeconds {

    /**
     * FormattingSeconds Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        System.out.println("seconds in ss format : " + sdf.format(date));
    }

}
