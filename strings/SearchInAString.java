// strings/SearchInAString.java
package strings;

/**
 * Problem Description: 
 * >> How to search a word inside a string ? 
 * Solution: 
 * >> This example shows how we can search a word within a String object using indexOf() method 
 * >> which returns a position index of a word within the string if found. Otherwise it returns -1.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class SearchInAString {

    /**
     * SearchInAString Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strOrig = "Hello readers";
        int intIndex = strOrig.indexOf("Hello");
        if (intIndex == - 1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index " + intIndex);
        }
    }

}
