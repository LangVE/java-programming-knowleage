package study.ducksunlee.chap7.sun;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSequenceTest {
    @Test
    public void fibonacci_length0() {
        // given
        int length = 0;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(length);

        // then
        List<Integer> expectedList = new ArrayList<Integer>();

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void fibonacci_length1() {
        // given
        int length = 1;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(length);

        // then
        List<Integer> expectedList = Arrays.asList(0);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void fibonacci_length2() {
        // given
        int length = 2;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(length);

        // then
        List<Integer> expectedList = Arrays.asList(0, 1);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void fibonacci_length3() {
        // given
        int length = 3;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(length);

        // then
        List<Integer> expectedList = Arrays.asList(0, 1, 1);

        Assert.assertEquals(expectedList, actualList);
    }
    
    @Test
    public void fibonacci_length5() {
        // given
        int length = 5;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(length);

        // then
        List<Integer> expectedList = Arrays.asList(0, 1, 1, 2, 3);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void fibonacci_lengthN() {

        Assert.assertEquals(FibonacciSequence.fibonacci(0), Arrays.asList());
        Assert.assertEquals(FibonacciSequence.fibonacci(1), Arrays.asList(0));
        Assert.assertEquals(FibonacciSequence.fibonacci(2), Arrays.asList(0, 1));
        Assert.assertEquals(FibonacciSequence.fibonacci(3), Arrays.asList(0, 1, 1));
        Assert.assertEquals(FibonacciSequence.fibonacci(4), Arrays.asList(0, 1, 1, 2));
        Assert.assertEquals(FibonacciSequence.fibonacci(5), Arrays.asList(0, 1, 1, 2, 3));
        Assert.assertEquals(FibonacciSequence.fibonacci(6), Arrays.asList(0, 1, 1, 2, 3, 5));
        Assert.assertEquals(FibonacciSequence.fibonacci(7), Arrays.asList(0, 1, 1, 2, 3, 5, 8));
        Assert.assertEquals(FibonacciSequence.fibonacci(8), Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
        Assert.assertEquals(FibonacciSequence.fibonacci(9), Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21));
        Assert.assertEquals(FibonacciSequence.fibonacci(10), Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void fibonacci0보다작을때() {
    	int length = -1;
    	List<Integer> actualList = FibonacciSequence.fibonacci(length);
    }
    
    @Test
    public void fibN() {
    	Assert.assertEquals(0, FibonacciSequence.fibN(0));
    	Assert.assertEquals(1, FibonacciSequence.fibN(1));
    	Assert.assertEquals(1, FibonacciSequence.fibN(2));
    	Assert.assertEquals(34, FibonacciSequence.fibN(9));
    	System.out.println(FibonacciSequence.fibN(7));
    }
    
    @Test
    public void bigFib() {
    	long nonCacheStart = System.nanoTime();
    	Assert.assertEquals(1134903170, FibonacciSequence.fibN(45));
    	long nonCacheEnd = System.nanoTime();
    	
    	System.out.println("noncache: " + (nonCacheEnd - nonCacheStart));
    	
    	long cacheStart = System.nanoTime();
    	Assert.assertEquals(1134903170, FibonacciSequence.cachedFibN(45));
    	long cacheEnd = System.nanoTime();
    	
    	System.out.println("cache: " + (cacheEnd - cacheStart));
    }
   
}
