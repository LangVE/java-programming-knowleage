package study.ducksunlee.chap15.langve;

import java.io.Serializable;

/**
 * Created by 이영호 on 2018-01-09.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6043161205719730278L;
    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
