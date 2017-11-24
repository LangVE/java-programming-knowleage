package study.ducksunlee.chap11.langve;

import org.junit.Test;

/**
 * Created by 이영호 on 2017-11-24.
 */
public class ThreadPrinterTest {
    @Test
    public void print() throws InterruptedException {
        final Thread separateThread = new Thread(new ThreadPrinter());
        separateThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("From the main thread: "
                    + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }

}

