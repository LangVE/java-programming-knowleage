package study.ducksunlee.chap7.langve;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 이영호 on 2017-09-01.
 */
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
    public void fibonacci_length4() {
        // given
        int length = 4;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(length);

        // then
        List<Integer> expectedList = Arrays.asList(0, 1, 1, 2);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void fibonacci() {
        // given

        // when

        // then
        Assert.assertEquals(Arrays.asList(0), FibonacciSequence.fibonacci(1));
        Assert.assertEquals(Arrays.asList(0, 1), FibonacciSequence.fibonacci(2));
        Assert.assertEquals(Arrays.asList(0, 1, 1), FibonacciSequence.fibonacci(3));
        Assert.assertEquals(Arrays.asList(0, 1, 1, 2), FibonacciSequence.fibonacci(4));
    }

    @Test
    public void fibN() {
        // given
        int index0 = 0;
        int index1 = 1;
        int index2 = 2;
        int index3 = 3;

        // when
        Integer actualResult0 = FibonacciSequence.fibN(index0);
        Integer actualResult1 = FibonacciSequence.fibN(index1);
        Integer actualResult2 = FibonacciSequence.fibN(index2);
        Integer actualResult3 = FibonacciSequence.fibN(index3);

        //then
        Integer expectedResult0 = 0;
        Assert.assertEquals(expectedResult0, actualResult0);

        Integer expectedResult1 = 1;
        Assert.assertEquals(expectedResult1, actualResult1);

        Integer expectedResult2 = 1;
        Assert.assertEquals(expectedResult2, actualResult2);

        Integer expectedResult3 = 2;
        Assert.assertEquals(expectedResult3, actualResult3);
    }

    @Test
    public void fibNRecursive() {
        // given
        int index0 = 0;
        int index1 = 1;
        int index2 = 2;
        int index3 = 3;

        // when
        int actual0 = FibonacciSequence.fibNRecursive(index0);
        int actual1 = FibonacciSequence.fibNRecursive(index1);
        int actual2 = FibonacciSequence.fibNRecursive(index2);
        int actual3 = FibonacciSequence.fibNRecursive(index3);

        // then
        int expected0 = 0;
        int expected1 = 1;
        int expected2 = 1;
        int expected3 = 2;
        Assert.assertEquals(expected0, actual0);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibNRecursive_잘못된index값을요청했을때() {
        // given
        int index0 = -1;

        // when
        int actual0 = FibonacciSequence.fibNRecursive(index0);

        // then
    }
}
