// Strings/SearchingLastOccurance.java
package Stirngs;

/**
 * Problem Description: 
 * >> How to search the last position of a substring ?
 * Solution: 
 * >> This example shows how to determine the last position of a substring inside a string 
 * >> with the help of strOrig.lastIndexOf(Stringname) method.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class SearchingLastOccurance {

    /**
     * SearchingLastOccurance Execute Method
     *
     * @param args
     */
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if (lastIndex == - 1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Last occurrence of Hello is at index " + lastIndex);
        }
    }

}
