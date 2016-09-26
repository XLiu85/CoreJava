// arrays/DimensionOfArray.java
package arrays;

/**
 * Problem Description:
 * >> How to determine the upper bound of a two dimensional array ?
 * Solution:
 * >> Following example helps to determine the upper 
 * >> bound of a two dimensional array with the use of arrayname.length.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class DimensionOfArray {

    /**
     * DimensionOfArray Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] data = new String[2][5];
        System.out.println("Dimension 1: " + data.length);
        System.out.println("Dimension 2: " + data[0].length);
    }

}
