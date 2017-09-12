package study.ducksunlee.chap7.duck;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LSD on 2017-09-08.
 */
public class Fibonacci {

    public static int fibonacciNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("not allowed");
        } else if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacciNumber(num-1)+fibonacciNumber(num-2);
        }
    }

    private static Map<Integer,Integer> fibonacciMap;
    static {
        fibonacciMap = new HashMap<>();
        fibonacciMap.put(0,0);
        fibonacciMap.put(1,1);
    }

    public static int fibonacciNumberMap(int num) {
        int returnValue;
        if (num < 0) {
            throw new IllegalArgumentException("negative number not allowed!!");
        } else if (fibonacciMap.containsKey(num)) {
            return fibonacciMap.get(num);
        } else {
            returnValue = fibonacciNumberMap(num-1) + fibonacciNumberMap(num-2);
            fibonacciMap.put(num, returnValue);
        }
        return returnValue;
    }

}
