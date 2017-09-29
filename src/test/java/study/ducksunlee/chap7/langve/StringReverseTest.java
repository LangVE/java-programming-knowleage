package study.ducksunlee.chap7.langve;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 이영호 on 2017-09-29.
 */
public class StringReverseTest {

    @Test
    public void reverse() {
        // given
        String target = "abc";

        // when
        String actual = StringReverse.reverse(target);

        // then
        String expected = "cba";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inPlaceReverse() {
        // given
        String target = "abc";

        // when
        String actual = StringReverse.inPlaceReverse(target);

        // then
        String expected = "cba";
        Assert.assertEquals(expected, actual);
    }
}
