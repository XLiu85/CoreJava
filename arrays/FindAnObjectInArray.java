// arrays/FindAnObjectInArray.java
package arrays;

import java.util.ArrayList;

/**
 * Problem Description: 
 * >> How to find an object or a string in an Array?
 * Solution: 
 * >> Following example uses Contains method to search a String in the Array.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class FindAnObjectInArray {

    /**
     * FindAnObjectInArray Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        System.out.println("Array elements of array1" + objArray);
        System.out.println("Array elements of array2" + objArray2);
        System.out.println("Array 1 contains String common2?? " + objArray.contains("common1"));
        System.out.println("Array 2 contains Array1?? " + objArray2.contains(objArray));
    }

}
