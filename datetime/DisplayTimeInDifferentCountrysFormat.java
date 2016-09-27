// datetime/DisplayTimeInDifferentCountrysFormat.java
package datetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Problem Description:
 * >> How to display time in different country's format?
 * Solution:
 * >> Following example uses Locale class & DateFormat class to display date in different Country's format.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayTimeInDifferentCountrysFormat {

    /**
     * DisplayTimeInDifferentCountrysFormat Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is " + d1.toString());
        Locale locItalian = new Locale("it", "ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language in Switzerland Format : " + df.format(d1));
    }

}
