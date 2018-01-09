package study.ducksunlee.chap7.duck;

/**
 * Created by 이상덕 on 2017-09-29.
 */
public class Palindrome {
    public static String getPalindrome(String expectedStr) {
        if (expectedStr == null || "".equals(expectedStr)) {
            throw new RuntimeException("Null Point Exception");
        }

        StringBuffer reverseStr = new StringBuffer(expectedStr);

        if (expectedStr.equals(reverseStr.reverse().toString())) {
            return reverseStr.reverse().toString();
        } else {
            return expectedStr;
        }
    }
}
