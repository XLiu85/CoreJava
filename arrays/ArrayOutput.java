// arrays/ArrayOutput.java
package arrays;

/**
 * Problem Description:
 * >> How to write an array of strings to the output console ?
 * Solution:
 * >> Following example demonstrates writing elements of an array to the output console through looping.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class ArrayOutput {

    /**
     * ArrayOutput Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] greeting = new String[3];
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";
        for (int i = 0; i < greeting.length; i++) {
            System.out.println(greeting[i]);
        }
    }

}