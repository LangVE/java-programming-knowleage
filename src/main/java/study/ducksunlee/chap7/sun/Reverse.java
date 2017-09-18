package study.ducksunlee.chap7.sun;

/**
 * Created by 최선 on 2017-09-18.
 */
public class Reverse {
    public static String reverse(final String word) {
        StringBuffer s = new StringBuffer();

        for(int i = word.length()-1; i >= 0 ; i--){
            s.append(word.charAt(i));
        }
        return s.toString();
    }
}
