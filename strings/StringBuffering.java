// strings/StringBuffering.java
package strings;

/**
 * Problem Description: 
 * >> How to buffer strings ? 
 * Solution: 
 * >> Following example buffers strings and flushes it by using emit() method.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/26
 */
public class StringBuffering {

    /**
     * StringBuffering Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        countTo_N_Improved();
    }
    private final static int MAX_LENGTH = 30;
    private static String buffer = "";

    private static void emit(String nextChunk) {
        if (buffer.length() + nextChunk.length() > MAX_LENGTH) {
            System.out.println(buffer);
            buffer = "";
        }
        buffer += nextChunk;
    }
    private static final int N = 100;

    private static void countTo_N_Improved() {
        for (int count = 2; count <= N; count += 2) {
            emit(" " + count);
        }
    }
}
