package study.ducksunlee.chap7.langve;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by 이영호 on 2017-10-10.
 */
public class IteratorsTest {
    @Test
    public void multipleIterators() {
        final Iterator<Integer> a = Arrays.asList(1, 2, 3, 4, 5).iterator();
        final Iterator<Integer> b = Arrays.asList(6).iterator();
        final Iterator<Integer> c = new ArrayList<Integer>().iterator();
        final Iterator<Integer> d = new ArrayList<Integer>().iterator();
        final Iterator<Integer> e = Arrays.asList(7, 8, 9).iterator();

        final Iterator<Integer> singleIterator = Iterators.singleinterrator(Arrays.asList(a, b, c, d, e));

        Assert.assertTrue(singleIterator.hasNext());

        for (Integer i = 1; i <= 9; i++) {
            Assert.assertEquals(i, singleIterator.next());
        }

        Assert.assertFalse(singleIterator.hasNext());
    }
}
