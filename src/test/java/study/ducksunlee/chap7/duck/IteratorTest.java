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

}
