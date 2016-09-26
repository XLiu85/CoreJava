// Strings/StringRegionMatch.java
package Stirngs;

/**
 * Problem Description: 
 * >> How to match regions in strings ? 
 * Solution: 
 * >> Following example determines region matchs in two strings by using regionMatches() method.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class StringRegionMatch {

    public static void main(String[] args) {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with Microsoft";
        boolean match = first_str.regionMatches(11, second_str, 12, 9);
        System.out.println("first_str[11 -19] == " + "second_str[12 - 21]:-" + match);
    }

}
