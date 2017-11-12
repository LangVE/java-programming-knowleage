package study.ducksunlee.chap9.deok;

/**
 * Created by LSD on 2017-11-12.
 */
public class AuthService {
    private AuthDao dao;

    public boolean isLogin(String id) {
        boolean isLogin = dao.isLogin(id);
        if (isLogin) {
            System.out.println("service login test");
        }
        return isLogin;
    }
}
