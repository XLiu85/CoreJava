// arrays/ArrayFilling.java
package arrays;

import java.util.Arrays;

/**
 * Problem Description: 
 * >> How to fill (initialize at once) an array ? 
 * Solution:
 * >> This example fill (initialize all the elements of the array in one short) an array by using 
 * >> Array.fill(arrayname,value) method and Array.fill(arrayname ,starting index ,ending index ,value) method 
 * >> of Java Util class.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class ArrayFilling {

    /**
     * ArrayFilling Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6, 50);
        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
