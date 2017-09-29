package study.ducksunlee.chap7.langve;

import java.util.*;

/**
 * Created by 이영호 on 2017-09-15.
 */
public class Anagrams {

    Map<String, List<String>> lookup;

    public Anagrams(List<String> sourceWords) {
        this.lookup = new HashMap<String, List<String>>();

        for (String word : sourceWords) {
            String signature = alphabetize(word);

            if (lookup.containsKey(signature)) {
                lookup.get(signature).add(word);
            } else {
                List<String> anaList = new ArrayList<>();
                anaList.add(word);
                lookup.put(signature, anaList);
            }
        }
    }

    String alphabetize(String word) {
        byte[] b = word.getBytes();
        Arrays.sort(b);

        return new String(b);
    }

    public List<String> getAnagrams(String targetWord) {
        String sign = alphabetize(targetWord);

        return lookup.get(sign);
    }
}
