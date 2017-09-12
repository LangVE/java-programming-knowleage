package sangdeok;

import org.junit.Assert;
import org.junit.Test;
import study.ducksunlee.chap7.duck.Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 이상덕 on 2017-09-08.
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

    @Test
    public void fibonacci_num_map_minus_1() {

        //given
        int num = -1;

        //when
        int fibonacciNum = Fibonacci.fibonacciNumberMap(num);

        //then
        System.out.println("fibonacci number : " + fibonacciNum);
        Assert.assertEquals(num, fibonacciNum);
    }

    @Test
    public void fibonacci_num_map0() {

        //given
        int num = 0;

        //when
        int fibonacciNum = Fibonacci.fibonacciNumberMap(num);

        //then
        System.out.println("fibonacci number : " + fibonacciNum);
        Assert.assertEquals(num, fibonacciNum);
    }

    @Test
    public void fibonacci_num_map1() {

        //given
        int num = 1;

        //when
        int fibonacciNum = Fibonacci.fibonacciNumberMap(num);

        //then
        System.out.println("fibonacci number : " + fibonacciNum);
        Assert.assertEquals(num, fibonacciNum);
    }

    @Test
    public void fibonacci_num_map3() throws Exception {

        //given
        int num = 3;

        //when
        List<Integer> fibonacciList = new ArrayList<>(num);
        for (int i=0; i<num; i++) {
            fibonacciList.add(Fibonacci.fibonacciNumberMap(i));
        }

        //then
        List<Integer> expectedList = Arrays.asList(0,1,1);
        fibonacciList.forEach(System.out::print);

        Assert.assertEquals(expectedList, fibonacciList);
    }

    @Test
    public void fibonacci_num_vs_map() throws Exception {

        //given
        int num = 40;
        long startTime;
        long endTime;

        //when
        startTime = System.currentTimeMillis();
        int fibonacciNumMap = Fibonacci.fibonacciNumberMap(num);
        endTime = System.currentTimeMillis();
        float fibonacciNumMapResTime = (( endTime - startTime )/1000.0f);

        startTime = System.currentTimeMillis();
        int fibonacciNum = Fibonacci.fibonacciNumber(num);
        endTime = System.currentTimeMillis();
        float fibonacciNumResTime = (( endTime - startTime )/1000.0f);

        //then
        Assert.assertEquals(fibonacciNum, fibonacciNumMap);
        System.out.println("num : "+ num);
        System.out.println("[fibonacciNum] result : "+fibonacciNum+" , response time : " + fibonacciNumResTime + "sec.");
        System.out.println("[fibonacciNumMap] result : "+fibonacciNumMap+" , response time : " + fibonacciNumMapResTime + "sec.");
    }
}
