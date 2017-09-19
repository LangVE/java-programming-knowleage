package study.ducksunlee.chap7.sun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sun on 2017-09-14.
 */
public class AnagramsBasic {

    public static List<String> anagramsBasic(String a, List<String> ws){
        List<String> anagrams = new ArrayList<String>();

        for(String w: ws){
            if(isAnagram(w, a))
                anagrams.add(w);
        }
        return anagrams;
    }

    public static boolean isAnagram(String word1, String word2) {

        byte[] letters = word1.getBytes();
        for (byte letter : letters) {
            String str = new String(new byte[] { letter }, 0, 1);
            if(word2.contains(str)){
                word2 = word2.replaceFirst(str, "");
            }else
                return false;
        }

        if(word2 == null || word2.equals(""))
            return true;
        else
            return false;

    }

}
