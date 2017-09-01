package study.ducksunlee.chap7.langve;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 이영호 on 2017-09-01.
 */
public class FizzBuzzTest {
    @Test
    public void check_3의배수인경우()
    {
        // given
        int targetValue = 3;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.check(targetValue);

        // then
        String expectedResult = "Fizz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void check_5의배수인경우()
    {
        // given
        int targetValue = 5;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.check(targetValue);

        // then
        String expectedResult = "Buzz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void check_15의배수인경우()
    {
        // given
        int targetValue = 15;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.check(targetValue);

        // then
        String expectedResult = "FizzBuzz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void check_배수가아닌경우()
    {
        // given
        int targetValue = 0;
        int targetValue1 = 1;
        int targetValue2 = 2;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.check(targetValue);
        String actualResult1 = fizzBuzz.check(targetValue1);
        String actualResult2 = fizzBuzz.check(targetValue2);

        // then
        String expectedResult = "";
        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(expectedResult, actualResult1);
        Assert.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void advancedCheck_3의배수()
    {
        // given
        int targetValue = 3;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.advancedCheck(targetValue);

        // then
        String expectedResult = "Fizz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void advancedCheck_5의배수인경우()
    {
        // given
        int targetValue = 5;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.advancedCheck(targetValue);

        // then
        String expectedResult = "Buzz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void advancedCheck_15의배수인경우()
    {
        // given
        int targetValue = 15;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.advancedCheck(targetValue);

        // then
        String expectedResult = "FizzBuzz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void advancedCheck_배수가아닌경우()
    {
        // given
        int targetValue = 0;
        int targetValue1 = 1;
        int targetValue2 = 2;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.advancedCheck(targetValue);
        String actualResult1 = fizzBuzz.advancedCheck(targetValue1);
        String actualResult2 = fizzBuzz.advancedCheck(targetValue2);

        // then
        String expectedResult = "";
        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(expectedResult, actualResult1);
        Assert.assertEquals(expectedResult, actualResult2);
    }

    @Test
    public void excute()
    {
        // given
        int count = 100;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.excute(count);

        // then
    }
}