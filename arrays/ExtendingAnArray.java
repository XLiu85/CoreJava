// arrays/ExtendingAnArray.java
package arrays;

/**
 * Problem Description: 
 * >> How to extend an array after initialisation?
 * Solution: 
 * >> Following example shows how to extend an array after initialization by creating an new array.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class ExtendingAnArray {

    /**
     * ExtendingAnArray Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C"};
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended) {
            System.out.println(str);
        }
    }

}
