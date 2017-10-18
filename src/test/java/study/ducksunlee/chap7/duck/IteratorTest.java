package study.ducksunlee.chap7.duck;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LSD on 2017-10-10.
 */
public class IteratorTest {

    @Test
    public void iterator_test() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator<String> iterator = list.iterator();

        System.out.println(String.format("list.iterator() : %s", iterator.hasNext()));

        while (iterator.hasNext()) {
            if ("c".equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println(String.format("list : %s", list.toString()));
        System.out.println(String.format("list.iterator() : %s", iterator.hasNext()));

    }

    @Test
    public void iterator_custom_test() {
        //given
        final Iterator<Integer> a = Arrays.asList(1, 2, 3, 4, 5).iterator();
        final Iterator<Integer> b = Arrays.asList(6).iterator();
        final Iterator<Integer> c = new ArrayList<Integer>().iterator();
        final Iterator<Integer> d = new ArrayList<Integer>().iterator();
        final Iterator<Integer> e = Arrays.asList(7, 8, 9).iterator();

        final Iterator<Integer> singleIterator = IteratorCustom.singleIterator(Arrays.asList(a, b, c, d, e));

        //when
        List<Integer> actualList = new ArrayList<Integer>();
        Assert.assertTrue(singleIterator.hasNext());
        for (Integer i = 1; i <= 9; i++) {
            Integer value = singleIterator.next();
//            System.out.println("i : "+ i + " | value : " + value);
            actualList.add(value);
            Assert.assertEquals(i, value) ;
        }

        //then
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Assert.assertFalse(singleIterator.hasNext());
        Assert.assertEquals(expectedList, actualList);

        System.out.println(String.format("hasNext() : %s", singleIterator.hasNext()));
        System.out.println(String.format("actualList : %s", actualList.toString()));
    }

    @Test
    public void iterator_vs_list_performance_test() {

        long beginMillis, endMillis;

        int inRoopSize = 10;
        int maxRoopSize = 10000000;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < maxRoopSize; i++) {
            list.add(i);
        }

        System.out.println("--------< Iterator while >--------");

        for (int idx = 0; idx < inRoopSize; idx++) {
            beginMillis = System.nanoTime();

            Iterator<Integer> iterator = list.iterator();

            while (iterator.hasNext()) {
                list.get(iterator.next());
            }

            endMillis = System.nanoTime();

            System.out.println(((double) (endMillis - beginMillis) / 1000000000));
        }

        System.out.println("--------< ArrayLIst for >--------");
        for (int idx = 0; idx < inRoopSize; idx++) {
            beginMillis = System.nanoTime();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
            endMillis = System.nanoTime();

            System.out.println(((double) (endMillis - beginMillis) / 1000000000));
        }
    }

}
