package study.ducksunlee.chap7.pair_coding;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by LSD on 2017-09-29.
 */
public class ReverseTest {
    @Test
    public void reverse() {
        // given
        String target = "abc";

        // when
        String actual = Reverse.reverse(target);

        // then
        String expected = "cba";
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void reverse_null인경우() {
        // given
        String target = null;

        // when
        String actual = Reverse.reverse(target);

        // then
        String expected = "cba";
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void reverse_empty인경우() {
        // given
        String target = "";

        // when
        String actual = Reverse.reverse(target);

        // then
        String expected = "cba";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inPlaceReverse() {
        //given
        String target = "abc";

        //when
        String actual = Reverse.inPlaceReverse(target);

        //then
        String excepted = "cba";
        Assert.assertEquals(excepted, actual);

    }
}
