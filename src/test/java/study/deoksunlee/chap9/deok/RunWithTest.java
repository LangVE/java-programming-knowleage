package study.deoksunlee.chap9.deok;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이상덕 on 2017-10-31.
 */

@RunWith(Parameterized.class)
public class RunWithTest {
    private final int a;
    private final int b;
    private final int expectedAddition;
    private final int expectedSubtraction;
    private final int expectedMultiplication;
    private final int expectedDivision;

    public RunWithTest(final int a,
                              final int b,
                              final int expectedAddition,
                              final int expectedSubtraction,
                              final int expectedMultiplication,
                              final int expectedDivision) {
        this.a = a;
        this.b = b;
        this.expectedAddition = expectedAddition;
        this.expectedSubtraction = expectedSubtraction;
        this.expectedMultiplication = expectedMultiplication;
        this.expectedDivision = expectedDivision;
    }

    @Parameterized.Parameters
    public static List<Integer[]> parameters() {
        return new ArrayList<Integer[]>(1) {{
            add(new Integer[] {1, 2, 3, -1, 2, 0});
            add(new Integer[] {0, 1, 1, -1, 0, 0});
            add(new Integer[] {-11, 2, -9, -13, -22, -5});
        }};
    }

    @Test
    public void addNumbers() {
        Assert.assertEquals(expectedAddition, a + b);
        System.out.println("expectedAddition : "+expectedAddition);
        System.out.println("a : " +a + "    b : "+b);
    }

    @Test
    public void subtractNumbers() {
        Assert.assertEquals(expectedSubtraction, a - b);
    }

    @Test
    public void multiplyNumbers() {
        Assert.assertEquals(expectedMultiplication, a * b);
    }

    @Test
    public void divideNumbers() {
        Assert.assertEquals(expectedDivision, a / b);
    }
}
