package study.ducksunlee.chap15.deok;

import java.io.Serializable;

/**
 * Created by 이상덕 on 2018-01-08.
 */
public class User implements Serializable{
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
