package study.ducksunlee.chap7.sun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagrams {
	final Map<String, List<String>> lookup = new HashMap<String, List<String>>();
	
	public Anagrams(final List<String> words) {
		for(final String word: words) {
			System.out.println(word);
			final String signature = alphabetize(word);
			System.out.println(signature);
			System.out.println(lookup.containsKey(signature));
			if(lookup.containsKey(signature)) {
				lookup.get(signature).add(word);
			}else {
				final List<String> anagramList = new ArrayList<String>();
				anagramList.add(word);
				lookup.put(signature, anagramList);
			}
		}
		
		Set<String> keySet = lookup.keySet();
		  Iterator<String> iterator = keySet.iterator();
		  while (iterator.hasNext()) {
		   String key = iterator.next();
		   Object value = lookup.get(key);
		   System.out.printf("key : %s , value : %s %n", key, value);
		  }

	}
	
	private String alphabetize(final String word) {
		final byte[] bytes = word.getBytes();
		Arrays.sort(bytes);
		return new String(bytes);
	}
	
	public List<String> getAnagram(final String word){
		final String signature = alphabetize(word);
		final List<String> anagrams = lookup.get(signature);
		return anagrams == null ? new ArrayList<String>() : anagrams;
	}


}
