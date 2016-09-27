// collections/CollectionToArray.java
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description:
 * >> How to change a collection to an array?
 * Solution:
 * >> Following example shows how to convert a collection to an array by using list.add() 
 * >> and list.toArray() method of Java Util class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class CollectionToArray {

    /**
     * CollectionToArray Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");
        String[] stringArray = list.toArray(new String[0]);
        for (int i = 0; i < stringArray.length; ++i) {
            String contents = stringArray[i];
            System.out.print(contents);
        }
    }

}
