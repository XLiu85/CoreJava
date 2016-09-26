// Strings/ReplacingAString.java
package Stirngs;

/**
 * Problem Description:
 * >> How to replace a substring inside a string by another one ?
 * Solution:
 * >> This example describes how replace method of java String class can be used to replace character 
 * >> or substring by new one.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class ReplacingAString {

    /**
     * ReplacingAString Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println(str.replaceAll("He", "Ha"));
    }

}
