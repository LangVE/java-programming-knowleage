package study.ducksunlee.chap7.sun;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static java.util.Arrays.asList;

public class AnagramsTest {


	@Test
	public void anagramBasic(){

	    Assert.assertTrue(AnagramsBasic.isAnagram("apple", "apple"));
        Assert.assertFalse(AnagramsBasic.isAnagram("apple", "angle"));

        Assert.assertEquals(AnagramsBasic.anagramsBasic("apple", Arrays.asList("abcde", "palep", "elppa")), Arrays.asList("palep", "elppa"));

	}

	@Test
	public void anagram() {
		List<String> words = asList("dbeca", "apple", "alepp", "abble", "lepap", "lebba", "aglee");
		Anagrams ana = new Anagrams(words);
		System.out.println(ana.getAnagram("apple"));
	}

}
