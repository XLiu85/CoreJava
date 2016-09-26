// strings/ConcatenateStrings.java
package strings;

/**
 * Problem Description: 
 * >> How to optimize string concatenation ? 
 * Solution: 
 * >> Following example shows performance of concatenation by using "+" operator 
 * >> and StringBuffer.append() method.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class ConcatenateStrings {

    /**
     * ConcatenateStrings Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            String result = "This is"
                    + "testing the"
                    + "difference" + "between"
                    + "String" + "and" + "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for string"
                + "concatenation using + operator : "
                + (endTime - startTime) + " ms");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            StringBuilder result = new StringBuilder();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation"
                + "using StringBuffer : "
                + (endTime1 - startTime1) + " ms");
    }

}