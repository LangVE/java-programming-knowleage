package study.ducksunlee.chap7.duck;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 이상덕 on 2017-09-29.
 */
public class PalindromeTest {

    @Test
    public void test(){
        //given
        String expectedStr = "aba";

        //when
        String actualStr = Palindrome.getPalindrome(expectedStr);

        //then
        Assert.assertEquals(expectedStr, actualStr);
    }
}
