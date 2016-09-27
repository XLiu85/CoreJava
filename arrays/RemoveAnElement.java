// arrays/RemoveAnElement.java
package arrays;

import java.util.ArrayList;

/**
 * Problem Description: 
 * >> How to remove an element of array? 
 * Solution: 
 * >> Following example shows how to remove an element from array.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class RemoveAnElement {

    /**
     * RemoveAnElement Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        objArray.clear();
        objArray.add(0, "0th element");
        objArray.add(1, "1st element");
        objArray.add(2, "2nd element");
        System.out.println("Array before removing an element" + objArray);
        objArray.remove(1);
        objArray.remove("0th element");
        System.out.println("Array after removing an element" + objArray);
    }

}
