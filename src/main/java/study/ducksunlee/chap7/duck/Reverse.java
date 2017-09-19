package study.ducksunlee.chap7.duck;

/**
 * Created by 이상덕 on 2017-09-18.
 */
public class Reverse {
    public static String getReverseWithFor(String str) {
        String[] reverseStr = new String[str.length()];
        for(int i=0; i<str.length(); i++) {
            reverseStr[i] = str.charAt(reverseStr.length-i-1);
            //System.out.println(str.charAt(reverseStr.length-i-1));
        }
        return "";
    }

    public static String getReverseWithStringBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
