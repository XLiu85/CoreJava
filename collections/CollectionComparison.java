// collections/CollectionComparison.java
package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Problem Description:
 * >> How to compare elements in a collection ?
 * Solution:
 * >> Following example compares the element of a collection by converting a string into a treeset 
 * >> using Collection.min() and Collection.max() methods of Collection class.
 * 
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class CollectionComparison {

    /**
     * CollectionComparison Execute Method.
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[] coins = {"Penny", "nickel", "dime", "Quarter", "dollar"};
        Set set = new TreeSet();
        set.addAll(Arrays.asList(coins));
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

        for (int i = 0; i <= 10; i++) {
            System.out.println("-");
        }

        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set,String.CASE_INSENSITIVE_ORDER));
    }

}
