// datetime/DisplayTimeInItalianLanguage.java
package datetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Problem Description:
 * >> How to display time in different languages?
 * Solution:
 * >> This example uses DateFormat class to display time in Italian.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayTimeInItalianLanguage {

    /**
     * DisplayTimeInItalianLanguage Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is " + d1.toString());
        Locale locItalian = new Locale("it");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is " + df.format(d1));
    }

}
