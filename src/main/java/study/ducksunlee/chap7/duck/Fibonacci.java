package study.ducksunlee.chap7.duck;

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
}
