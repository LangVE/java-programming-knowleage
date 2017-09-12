package study.ducksunlee.chap7.pair_coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LSD on 2017-09-06.
 */
public class FibonacciSequence {
    public static List<Integer> fibonacci(int size)
    {
        List<Integer> list = new ArrayList<Integer>();

        if(size >= 1)
        {
            list.add(0);
        }
        if(size >= 2)
        {
            list.add(1);
        }

        return list;
    }
}
