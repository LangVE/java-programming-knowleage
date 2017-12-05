package study.ducksunlee.chap12.paircoding;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by LSD on 2017-12-05.
 */
public class DBConnectionTest {
    private final String url = "jdbc:mysql://localhost:3306/company_db?useSSL=false";
    //    private final String url = "jdbc:mysql://localhost:3306/company_db?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String user = "root";
    private final String password = "root";

    @Test
    public void connected() throws SQLException, ClassNotFoundException {
        final Connection connection = DriverManager.getConnection(url, user, password);
        Assert.assertFalse(connection.isClosed());
        connection.close();
        Assert.assertTrue(connection.isClosed());
    }
}
