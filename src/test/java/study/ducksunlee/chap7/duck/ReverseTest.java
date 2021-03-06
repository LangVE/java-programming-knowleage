package study.ducksunlee.chap7.duck;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by LSD on 2017-09-19.
 */
public class ReverseTest {

    @Test
    public void reverse_string(){
        //given
        String str = "ABC";

        //when
        String reverseStr = Reverse.getReverseWithFor(str);

        //then
        String expectedStr = "CBA";
        Assert.assertEquals(expectedStr, reverseStr);
    }

    @Test
    public void reverse_stringbuffer(){
        //given
        String str = "ABC";

        //when
        String reverseStr = Reverse.getReverseWithStringBuffer(str);

        //then
        String expectedStr = "CBA";
        Assert.assertEquals(expectedStr, reverseStr);
    }
}
