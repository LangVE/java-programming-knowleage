package study.ducksunlee.chap11.langve;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by 이영호 on 2017-11-28.
 */
public class UsingExecutorServiceTest {
    @Test
    public void execute() throws InterruptedException, ExecutionException, TimeoutException {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        final long startTime = System.currentTimeMillis();
        final Future<Double> future = executorService.submit(new PiCalculastor());

        final double pi = future.get(10, TimeUnit.SECONDS);
        final long endTime = System.currentTimeMillis();
        System.out.printf("Calculated Pi in %d milliseconds: %10.9f%n", endTime - startTime, pi);

        executorService.shutdown();
    }
}
