// strings/DeletingACharacter.java
package strings;

/**
 * Problem Description:
 * >> How to remove a particular character from a string ?
 * Solution:
 * >> Following example shows hoe to remove a character from a particular position from a string with the 
 * >> help of removeCharAt(string,position) method.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class DeletingACharacter {

    /**
     * DeletingACharacter Execute Method.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
