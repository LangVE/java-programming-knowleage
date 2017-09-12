package study.ducksunlee.chap7.sun;

public class Factorial {

	public static long factorial(int n) {

		if(n < 1)
			throw new IllegalArgumentException();
		
		long result = 1;
		
		for(int i = n; i > 0; i--) {
			result *= i;
		}
		return result;
	}

}
