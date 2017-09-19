package study.ducksunlee.chap7.pair_coding;

import org.junit.Assert;
import org.junit.Test;
import study.ducksunlee.chap7.pair_coding.FibonacciSequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LSD on 2017-09-06.
 */
public class FibonacciSequenceTest {
    @Test
    public void fibonacci_size0인경우()
    {
        // given
        int size = 0;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(size);

        // then
        //List<Integer> expectedList = new ArrayList<Integer>();

        Assert.assertEquals(0, actualList.size());
    }

    @Test
    public void fibonacci_size1인경우()
    {
        // given
        int size = 1;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(size);

        // then
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(0);

        Assert.assertEquals(expectedList.get(0), actualList.get(0));
    }

    @Test
    public void fibonacci_size2인경우()
    {
        // given
        int size = 2;

        // when
        List<Integer> actualList = FibonacciSequence.fibonacci(size);

        // then
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(0);
        expectedList.add(1);

        Assert.assertEquals(expectedList, actualList);
        Assert.assertArrayEquals(expectedList.toArray(), actualList.toArray());
    }
}
