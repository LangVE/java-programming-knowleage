package study.ducksunlee.chap15.deok;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * Created by 이상덕 on 2018-01-08.
 */
public class UserTest {
    @Test
    public void transientField() {
        try {
            final User user = new User("Noel", "secret321");
            final FileOutputStream fos = new FileOutputStream("D:/dev/prototype/JPK/chap15/user");
            final ObjectOutputStream oos = new ObjectOutputStream(fos);


            oos.writeObject(user);
            oos.flush();
            oos.close();
            fos.close();

            final FileInputStream fis = new FileInputStream("D:/dev/prototype/JPK/chap15/user");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            final User deserialized = (User)ois.readObject();

            Assert.assertEquals("Noel", deserialized.getUsername());
            Assert.assertNull(deserialized.getPassword());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
