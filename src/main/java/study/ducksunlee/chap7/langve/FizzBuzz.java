package study.ducksunlee.chap7.langve;

/**
 * Created by 이영호 on 2017-09-01.
 */
public class FizzBuzz {

    public String check(int targetValue) {
        String result = "";

        if (targetValue != 0 && targetValue % 3 == 0)
        {
            result = result + "Fizz";
        }

        if (targetValue != 0 && targetValue % 5 == 0)
        {
            result = result + "Buzz";
        }

        System.out.println(result);
        return result;
    }

    public String advancedCheck(int targetValue) {
        String result = "";

        result = result + toWord(targetValue, 3, "Fizz");
        result = result + toWord(targetValue, 5, "Buzz");

        System.out.println(result);
        return result;
    }

    private String toWord(int targetValue, int compareValue, String word) {
        String result = "";

        if (targetValue != 0 && targetValue % compareValue == 0)
        {
            result = result + word;
        }
        return result;
    }

    public void excute(int count) {

        for(int i = 1; i <= count; i++)
        {
            System.out.print(String.format("i(%s) : ", i));
            this.check(i);
        }
    }
}
