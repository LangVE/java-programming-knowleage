package study.ducksunlee.chap9.deok;

/**
 * Created by LSD on 2017-11-12.
 */
public class AuthDao {
    public boolean isLogin(String id) {
        System.out.println("dao isLogin test");

        boolean rtn = false;
        if (id != null) {
            rtn = true;
        } else {
            rtn = false;
        }
        return rtn;
    }
}
