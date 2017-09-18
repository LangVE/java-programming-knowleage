package study.ducksunlee.chap7.sun;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 최선 on 2017-09-18.
 */
public class ReverseTest {

    @Test
    public void reverseTest(){
        String word = "APPLE";

        String actualVal = Reverse.reverse(word);

        Assert.assertEquals("ELPPA", actualVal);
    }
}
