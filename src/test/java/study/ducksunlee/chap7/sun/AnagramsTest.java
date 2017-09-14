package study.ducksunlee.chap7.sun;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AnagramsTest {

	@Test
	public void anagram() {
		List<String> words = Arrays.asList("dbeca", "apple", "alepp", "abble", "lepap", "lebba", "aglee");
		Anagrams ana = new Anagrams(words);
		System.out.println(ana.getAnagram("apple"));
	}
}
