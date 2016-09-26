// Strings/StringFormatting.java
package strings;

import java.util.Locale;

/**
 * Problem Description:
 * >> How to format strings ?
 * Solution:
 * >> Following example returns a formatted string value by using a specific locale, 
 * >> format and arguments in format() method
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class StringFormatting {

    /**
     * StringFormatting Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.JAPAN, "%-10.4f%n%n", e);
    }
    
}
