package study.ducksunlee.chap9.sun;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by 최선 on 2017-11-07.
 */
public class TimeOutTest {

    @Test(timeout = 4000L)
    public void timeoutTest(){
        int num = 3 ;
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");

        for(int i=0; i < num; i++){
            Calendar cal = Calendar.getInstance() ;
            System.out.println(fmt.format(cal.getTime())) ;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException  e){
            }
        }
    }
}
