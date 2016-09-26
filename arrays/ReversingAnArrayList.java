// arrays/ReversingAnArrayList.java
package arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem Description:
 * >> How to reverse an array list ?
 * Solution:
 * >> Following example reverses an array list by using Collections.reverse(ArrayList)method.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class ReversingAnArrayList {

    /**
     * ReversingAnArrayList Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Before Reverse Order: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After Reverse Order: " + arrayList);
    }

}
