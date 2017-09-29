package study.ducksunlee.chap7.langve;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이영호 on 2017-09-15.
 */
public class AnagramsTest {

    private Anagrams anagrams;
    private List<String> sourceWords;

    @Before
    public void setUp() {
        System.out.println("setUp");
        sourceWords = new ArrayList<String>();
        sourceWords.add("ABC");
        sourceWords.add("BCA");
        sourceWords.add("CBA");
        sourceWords.add("BCD");

        anagrams = new Anagrams(sourceWords);
    }

    @Test
    public void getAnagram() {
        System.out.println("getAnagram");
        // given
        String targetWord = "BAC";

        // when
        List<String> actualWords = anagrams.getAnagrams(targetWord);

        // then
        List<String> expectedWords = new ArrayList<String>();
        expectedWords.add("ABC");
        expectedWords.add("BCA");
        expectedWords.add("CBA");

        Assert.assertEquals(expectedWords, actualWords);
    }

    @Test
    public void getAnagram_BCD를받은경우() {
        // given
        String targetWord = "DCB";

        // when
        List<String> actualWords = anagrams.getAnagrams(targetWord);

        // then
        List<String> expectedWords = new ArrayList<String>();
        expectedWords.add("BCD");

        Assert.assertEquals(expectedWords, actualWords);
    }

    @Test
    public void alphabetize() {
        List<String> sourceWords = new ArrayList<String>();

        String targetWord = "ABC";
        String targetWord2 = "BCA";

        Anagrams anagrams = new Anagrams(sourceWords);
        String actualWords = anagrams.alphabetize(targetWord);
        String actualWords2 = anagrams.alphabetize(targetWord2);

        System.out.println("actualWords = " + actualWords);
        System.out.println("actualWords2 = " + actualWords2);
        Assert.assertEquals(actualWords, actualWords2);
    }
}
