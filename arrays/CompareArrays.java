// arrays/CompareArrays.java
package arrays;

import java.util.Arrays;

/**
 * Problem Description: 
 * >> How to compare two arrays? 
 * Solution: 
 * >> Following example uses equals method to check whether two arrays are or not.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class CompareArrays {

    /**
     * CompareArrays Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ary = {1, 2, 3, 4, 5, 6};
        int[] ary1 = {1, 2, 3, 4, 5, 6};
        int[] ary2 = {1, 2, 3, 4};
        System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(ary, ary1));
        System.out.println("Is array 1 equal to array 3?? " + Arrays.equals(ary, ary2));
    }

}
