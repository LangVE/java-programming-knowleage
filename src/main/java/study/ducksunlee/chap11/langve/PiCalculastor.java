package study.ducksunlee.chap11.langve;

/**
 * Created by 이영호 on 2017-11-28.
 */
public class PiCalculastor implements java.util.concurrent.Callable<Double> {

    @Override
    public Double call() throws Exception {
        double currVal = 1.0;
        double nextVal = 0.0;
        double denominator = 1.0;

        for (int i = 0; Math.abs(nextVal - currVal) > 0.00000001d; denominator += 2.0, i++) {
            currVal = nextVal;

            if (i % 2 != 0) {
                nextVal = currVal - (1 / denominator);
            } else {
                nextVal = currVal + (1 / denominator);
            }
        }

        return currVal * 4;
    }
}
