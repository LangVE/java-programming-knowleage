package study.ducksunlee.chap10.deok;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 이상덕 on 2017-11-21.
 */
public class WeakReferenceTest {
    @Test
    public void weakReferenceStackManipulation() {
        final WeakReferenceStack<ValueContainer> stack = new WeakReferenceStack<>();

        final ValueContainer expected = new ValueContainer("Value for the stack");
        stack.push(new ValueContainer("Value for the stack"));

        ValueContainer peekedValue = stack.peek();
        Assert.assertEquals(expected, peekedValue);
        Assert.assertEquals(expected, stack.peek());
        peekedValue = null;
        System.gc();
        Assert.assertNull(stack.peek());
    }
}
