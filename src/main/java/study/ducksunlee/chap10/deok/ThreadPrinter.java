package study.ducksunlee.chap10.deok;

/**
 * Created by 이상덕 on 2017-11-23.
 */
public class ThreadPrinter implements Runnable {

    @Override
    public  void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From the main thread : "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
