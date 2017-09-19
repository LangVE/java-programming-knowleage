package study.ducksunlee.chap7.langve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 이영호 on 2017-09-05.
 */
public class FibonacciSequence {

    private static Map<Integer, Integer> fibCache = new HashMap<Integer, Integer>();

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

    public static Integer fibN(int index) {
        List<Integer> list = fibonacci(index + 1);
        return list.get(index);
    }

    public static int fibNRecursive(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index의 값이 0 이상이어야 합니다. index:" + index);
        }

        int result = 0;

        if (index == 0) {
            result = 0;
        } else if (index == 1) {
            result = 1;
        } else {
            result = fibNRecursive(index - 1) + fibNRecursive(index - 2);
        }

        return result;
    }

    public static int fibNRecursiveCached(int index) {
        int result = 0;

        if (fibCache.containsKey(index)) {
            result = fibCache.get(index);
        } else {
            result = fibNRecursive(index);
            fibCache.put(index, result);
        }

        return result;
    }
}
