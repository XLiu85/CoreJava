// Strings/SplitingAString.java
package Stirngs;

/**
 * Problem Description: 
 * >> How to split a string into a number of substrings ?
 * Solution:
 * >> Following example splits a string into a number of substrings with the help of str split(string) method 
 * >> and then prints the substrings.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class SplitingAString {

    /**
     * SplitingAString Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "jan-feb-march";
        String[] temp;
        String delimeter = "-";
        temp = str.split(delimeter);
        for (String temp1 : temp) {
            System.out.println(temp1);
            System.out.println("");
            str = "jan.feb.march";
            delimeter = "\\.";
            temp = str.split(delimeter);
        }
        for (String temp1 : temp) {
            System.out.println(temp1);
            System.out.println("");
            temp = str.split(delimeter, 2);
            for (String temp2 : temp) {
                System.out.println(temp2);
            }
        }
    }

}
