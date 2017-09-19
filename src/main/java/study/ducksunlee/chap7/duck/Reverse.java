package study.ducksunlee.chap7.duck;

/**
 * Created by LSD on 2017-09-19.
 */
public class Reverse {
    public static String getReverseWithFor(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++) {
            sb.append(String.valueOf(str.charAt(str.length()-i-1)));
        }
        return sb.toString();
    }

    public static String getReverseWithStringBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
