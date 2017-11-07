package study.deoksunlee.chap9.deok;

import org.junit.Test;

/**
 * Created by LSD on 2017-11-06.
 */
public class TimeOutTest {

    @Test(timeout = 6000L)
    public void test1() {
        try {
            Thread.sleep(5000);
            System.out.println("test1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(timeout = 1000L)
    public void test2() {
        try {
            Thread.sleep(5000);
            System.out.println("test2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
