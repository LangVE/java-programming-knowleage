package study.ducksunlee.chap7.pair_coding;

/**
 * Created by LSD on 2017-09-29.
 */
public class Reverse {
    public static String reverse(String target) {
        StringBuilder result = new StringBuilder();

        validate(target);

        for (int i = target.length() - 1; i >= 0; i--) {
            result.append(target.charAt(i));
        }

        return result.toString();
    }

    private static void validate(String target) {
        if (target == null || "".equals(target)) {
            String message = "빈 문자열이 아닌 값을 넣어주세요. target : " + target;
            System.out.println(message);
            throw new RuntimeException(message);
        }
    }

    public static String inPlaceReverse(String target) {
        final StringBuilder builder = new StringBuilder(target);
        for (int i = 0; i < builder.length() / 2; i++) {
            final char tmp = builder.charAt(i);
            final int otherEnd = builder.length() - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd, tmp);
        }
        return builder.toString();
    }
}
