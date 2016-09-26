// Strings/ConvertingIntoUppercase.java
package Stirngs;

/**
 * Problem Description:
 * >> How to convert a string totally into upper case?
 * Solution:
 * >> Following example changes the case of a string to upper case by using String toUpperCase() method.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class ConvertingIntoUppercase {

    /**
     * ConvertingIntoUppercase Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "string abc touppercase ";
        String strUpper = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: " + strUpper);
    }

}