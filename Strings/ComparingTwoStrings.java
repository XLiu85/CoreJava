// Strings/ComparingTwoStrings.java
package Stirngs;

/**
 * Problem Description: 
 * >> How to compare two strings ? 
 * Solution: 
 * >> Following example compares two strings by using str compareTo (string) , 
 * >> str compareToIgnoreCase(String) and str compareTo(object string) of string class
 * >> and returns the ascii difference of first odd characters of compared strings.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class ComparingTwoStrings {

    /**
     * ComparingTwoStrings Execute Method.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }

}
