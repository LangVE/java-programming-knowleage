package study.ducksunlee.chap10.deok;

/**
 * Created by 이상덕 on 2017-11-23.
 */
public class PiCalculator implements java.util.concurrent.Callable<Double> {

    public Double call() throws Exception {
        double currVal = 1.0;
        double nextVal = 0.0;
        double denominator = 1.0;

        for (int i = 0; Math.abs(nextVal - currVal) > 0.000000001d; denominator += 2.0, i++) {
            currVal = nextVal;
            if (i % 2 ==1) {
                nextVal = currVal - (1 / denominator);
            } else {
                nextVal = currVal + (1 / denominator);
            }
        }
        return currVal * 4;
    }
}
