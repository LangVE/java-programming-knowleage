package study.ducksunlee.chap11.langve;

/**
 * Created by 이영호 on 2017-11-24.
 */
public class ThreadPrinter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From the new thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
