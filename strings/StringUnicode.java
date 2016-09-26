// strings/StringUnicode.java
package strings;

/**
 * Problem Description:
 * >> How to determine the Unicode code point in string ?
 * Solution:
 * >> This example shows you how to use codePointBefore() method to return the character
 * >> (Unicode code point) before the specified index.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class StringUnicode {

    /**
     * StringUnicode Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test_string = "Welcome to TutorialsPoint";
        System.out.println("String under test is = " + test_string);
        System.out.println("Unicode code point at"
                + " position 5 in the string is = "
                + test_string.codePointBefore(5));
    }

}
