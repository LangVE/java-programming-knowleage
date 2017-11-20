package study.ducksunlee.chap10.langve;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by langve on 2017. 11. 21..
 */
public class WeakReferenceTest {
    @Test
    public void weakReferenceStackManipulation() {
        // given
        final WeakReferenceStack<ValueContainer> stack = new WeakReferenceStack<>();
        final ValueContainer expected = new ValueContainer("Value for the stack");
        stack.push(new ValueContainer("Value for the stack"));

        // when
        ValueContainer peekedValue = stack.peek();

        // then
//        Assert.assertEquals(expected, peekedValue);
//        Assert.assertEquals(expected, stack.peek());

        peekedValue = null;
        System.gc();
        Assert.assertNull(stack.peek());

    }
}
