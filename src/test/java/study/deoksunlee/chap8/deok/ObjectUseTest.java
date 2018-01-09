package study.deoksunlee.chap8.deok;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 이상덕 on 2017-10-13.
 */
public class ObjectUseTest {
    @Test
    public void staticVarialbeAccess() {

        Assert.assertEquals(ExampleClass.EXAMPLE_VALUE, 6);

        ExampleClass e1 = new ExampleClass();
        ExampleClass e2 = new ExampleClass();

        e1.EXAMPLE_VALUE = 22;

        Assert.assertEquals(ExampleClass.EXAMPLE_VALUE, 22);
        Assert.assertEquals(e2.EXAMPLE_VALUE, 22);
    }

}
