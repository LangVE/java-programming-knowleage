package study.ducksunlee.chap7.sun;


import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

	@Test
	public void factorialTest1() {
		// given
		int n = 1;

		// when
		long actualValue = Factorial.factorial(n);

		// then
		Assert.assertEquals(1, actualValue);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void factorialTest0() {
		// given
		int n = 0;

		// when
		long actualValue = Factorial.factorial(n);

		// then
		Assert.assertEquals(0, actualValue);
	}
	
	@Test
	public void factorialTest3() {
		// given
		int n = 3;

		// when
		long actualValue = Factorial.factorial(n);

		// then
		Assert.assertEquals(6, actualValue);
	}
	
	@Test
	public void factorialTestN() {
		
		Assert.assertEquals(1, Factorial.factorial(1));
		Assert.assertEquals(2, Factorial.factorial(2));
		Assert.assertEquals(6, Factorial.factorial(3));
		Assert.assertEquals(24, Factorial.factorial(4));
		Assert.assertEquals(120, Factorial.factorial(5));
		Assert.assertEquals(720, Factorial.factorial(6));
		Assert.assertEquals(5040, Factorial.factorial(7));
		Assert.assertEquals(40320, Factorial.factorial(8));
		Assert.assertEquals(362880, Factorial.factorial(9));
		Assert.assertEquals(3628800, Factorial.factorial(10));
	}
}
