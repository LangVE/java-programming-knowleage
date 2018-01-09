package study.ducksunlee.chap15.langve;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * Created by 이영호 on 2018-01-09.
 */
public class UserTest {
    @Test
    public void transientField() throws IOException, ClassNotFoundException {
        final User user = new User("Noel", "secret321");
        final FileOutputStream fos = new FileOutputStream("/tmp/user");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.flush();
        oos.close();
        fos.close();

        final FileInputStream fileOutputStream = new FileInputStream("/tmp/user");
        final ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
        final User deserialized = (User) objectInputStream.readObject();

        Assert.assertEquals("Noel", deserialized.getUsername());
        Assert.assertNull(deserialized.getPassword());
    }
}
