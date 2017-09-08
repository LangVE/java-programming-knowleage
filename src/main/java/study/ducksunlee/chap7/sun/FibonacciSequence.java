package study.ducksunlee.chap7.sun;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static List<Integer> fibonacci(int length) {

        List<Integer> list = new ArrayList<Integer>();
        int tmpSum = 0;

        if (length >= 1)
            list.add(0, 0);

        if (length >= 2)
            list.add(1, 1);
        
        if (length >= 3) {
        	for (int i = 3; i <= length; i++) {
        		tmpSum = list.get(i-3) + list.get(i-2);
            	list.add(i-1, tmpSum);
        	}
        }


        return list;
    }

}
