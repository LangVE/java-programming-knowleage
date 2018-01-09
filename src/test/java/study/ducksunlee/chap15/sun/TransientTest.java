package study.ducksunlee.chap15.sun;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TransientTest {
	@Test
	public void transientField() throws IOException, ClassNotFoundException{
		final User user = new User("Noel", "secret321");
		
		final FileOutputStream fos = new FileOutputStream("D:\\sun_workspace\\abc.txt");
		final ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(user);
		
		oos.flush();
		oos.close();
		fos.close();
		
		final FileInputStream fis = new FileInputStream("D:\\sun_workspace\\abc.txt");
		final ObjectInputStream ois = new ObjectInputStream(fis);
		
		final User deserialized = (User) ois.readObject();
		
		assertEquals("Noel", deserialized.getUsername());
		assertNull(deserialized.getPassword());
	}
}
