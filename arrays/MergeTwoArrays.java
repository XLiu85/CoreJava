// arrays/MergeTwoArrays.java
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description:
 * >> How to merge two arrays ?
 * Solution:
 * >> This example shows how to merge two arrays into a single array by the use of list.
 * >> Addall(array1.asList(array2) method of List class and Arrays.toString () method of Array class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class MergeTwoArrays {

    /**
     * MergeTwoArrays Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
    
}