package study.ducksunlee.chap10.deok;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by 이상덕 on 2017-11-23.
 */
public class ConcurrencyTest {

    @Test
    public void thread_parallel_exec() {
        final Thread separateThread = new Thread(new ThreadPrinter());
        separateThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("From the main thread : "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void thread_executor() {
        final Executor executor = Executors.newCachedThreadPool();
        executor.execute(new ThreadPrinter());
        executor.execute(new ThreadPrinter());
        executor.execute(new ThreadPrinter());
    }

    @Test
    public void thread_executorService() {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        final long startTime = System.currentTimeMillis();
        final Future<Double> future = executorService.submit(new PiCalculator());
        try {
            final double pi = future.get(10, TimeUnit.SECONDS);
            final long stopTime = System.currentTimeMillis();
            System.out.printf("Calculated Pi in %d milliseconds : %10.9f%n", stopTime - startTime, pi);
            executorService.shutdown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}