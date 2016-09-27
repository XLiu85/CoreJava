// strings/StringEmptyCheck.java
package strings;

/**
 * Java で String が null または空文字列かどうかをチェックする
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class StringEmptyCheck {

    /**
     * StringEmptyCheck Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(StringEmptyCheck.isEmpty(null));
        System.out.println(StringEmptyCheck.isEmpty("saka-en"));
        System.out.println(StringEmptyCheck.isEmpty(""));
    }

    /**
     * 指定された String が null または空文字列かどうかを返します。
     *
     * @param value String
     * @return null または空文字列かどうか。null または空文字列なら true 、それ以外なら false 。
     */
    private static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }
}
