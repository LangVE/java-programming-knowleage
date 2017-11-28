package study.ducksunlee.chap11.langve;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by 이영호 on 2017-11-24.
 */
public class UsingExecutorTest {
    @Test
    public void executor() {
        final Executor executor = Executors.newCachedThreadPool();
        executor.execute(new ThreadPrinter());
        executor.execute(new ThreadPrinter());
        executor.execute(new ThreadPrinter());
    }
}
