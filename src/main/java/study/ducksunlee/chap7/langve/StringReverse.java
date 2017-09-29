package study.ducksunlee.chap7.langve;

/**
 * Created by 이영호 on 2017-09-29.
 */
public class StringReverse {
    public static String reverse(String target) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = target.length() - 1; i >= 0; i--) {
            stringBuilder.append(target.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String inPlaceReverse(String target) {
        StringBuilder stringBuilder = new StringBuilder(target);
        int targetLength = stringBuilder.length();

        for (int i = 0; i < targetLength / 2; i++) {
            char tmp = stringBuilder.charAt(i);
            int indexOtherEnd = targetLength - i - 1;

            stringBuilder.setCharAt(i, stringBuilder.charAt(indexOtherEnd));
            stringBuilder.setCharAt(indexOtherEnd, tmp);
        }

        return stringBuilder.toString();
    }
}
