// datetime/DisplayingMonthsInShortFormat.java
package datetime;

import java.text.DateFormatSymbols;

/**
 * Problem Description:
 * >> How to display name of the months in short format?
 * Solution:
 * >> This example displays the names of the months in short form with the help of 
 * >> DateFormatSymbols().getShortMonths() method of DateFormatSymbols class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayingMonthsInShortFormat {

    /**
     * DisplayingMonthsInShortFormat Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        for (int i = 0; i < (shortMonths.length - 1); i++) {
            String shortMonth = shortMonths[i];
            System.out.println("shortMonth = " + shortMonth);
        }
    }

}
