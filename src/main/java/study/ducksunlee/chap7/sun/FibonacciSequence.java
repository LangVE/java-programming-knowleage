package study.ducksunlee.chap7.sun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciSequence {
	static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	
	public static List<Integer> fibonacci(int length) {

		if (length < 0)
			throw new IllegalArgumentException("0보다 커야 합니다.");

		List<Integer> list = new ArrayList<Integer>();
		int tmpSum = 0;

		if (length >= 1)
			list.add(0, 0);

		if (length >= 2)
			list.add(1, 1);

		if (length >= 3) {
			for (int i = 3; i <= length; i++) {
				tmpSum = list.get(i - 3) + list.get(i - 2);
				list.add(i - 1, tmpSum);
			}
		}

		return list;
	}
	
	public static int fibN(int n) {
		
		if (n < 0)
			throw new IllegalArgumentException("0보다 커야 합니다.");
		
		if(n == 0)
			return 0;
		
		if(n == 1)
			return 1;
		
		return fibN(n-2) + fibN(n-1);
	}
	
	public static int cachedFibN(int n) {
		
		if (n < 0)
			throw new IllegalArgumentException("0보다 커야 합니다.");
		
		cache.put(0, 0);
		cache.put(1, 1);
		
		return getCacheValue(n);
		
	}
	
	public static int getCacheValue(int n) {
		if(!cache.containsKey(n))
			cache.put(n, getCacheValue(n-2) + getCacheValue(n-1));

		return cache.get(n);
	}

}
