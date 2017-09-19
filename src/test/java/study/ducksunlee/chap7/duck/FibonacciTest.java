package study.ducksunlee.chap7.duck;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LSD on 2017-09-08.
 */
public class FibonacciTest {

    @Test
    public void fibonacci_num_0() throws Exception {

        //given
        int num = 0;

        //when
        int fibonacciNum = Fibonacci.fibonacciNumber(num);

        //then
        Assert.assertEquals(num, fibonacciNum);
    }

    @Test
    public void fibonacci_num_1() throws Exception {

        //given
        int num = 1;

        //when
        int fibonacciNum = Fibonacci.fibonacciNumber(num);

        //then
        Assert.assertEquals(num, fibonacciNum);
    }

    @Test
    public void fibonacci_num_3() throws Exception {
        //given
        int num = 3;

        //when
        List<Integer> fibonacciList = new ArrayList<>(num);
        for (int i=0; i<num; i++) {
            fibonacciList.add(Fibonacci.fibonacciNumber(i));
        }

        //then
        List<Integer> expectedList = Arrays.asList(0,1,1);
        fibonacciList.forEach(System.out::print);

        Assert.assertEquals(expectedList, fibonacciList);

    }
}
