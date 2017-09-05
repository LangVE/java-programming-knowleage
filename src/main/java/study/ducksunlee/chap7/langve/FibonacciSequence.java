package study.ducksunlee.chap7.langve;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이영호 on 2017-09-05.
 */
public class FibonacciSequence {
    public static List<Integer> fibonacci(int length) {

        List<Integer> list = new ArrayList<Integer>();

        if (length >= 1)
            list.add(0, 0);

        if (length >= 2)
            list.add(1, 1);

        for (int i = 2; i < length; i++) {
            int value = list.get(i - 2) + list.get(i - 1);
            list.add(i, value);
        }

        return list;
    }
}
