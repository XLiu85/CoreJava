// arrays/SearchMinAndMax.java
package arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Problem Description:
 * >> How to search the minimum and the maximum element in an array ?
 * Solution:
 * >> This example shows how to search the minimum and maximum element in an array by using Collection.max() 
 * >> and Collection.min() methods of Collection class .
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class SearchMinAndMax {

    /**
     * SearchMinAndMax Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
    
}