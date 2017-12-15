package study.ducksunlee.chap13.paircoding;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.junit.*;


import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by LSD on 2017-12-15.
 */
public class JettyJUnitTest {

    private static Server jettyServer;

    @BeforeClass
    public static void jettyStart() throws Exception {
        jettyServer = new Server(8080);
        EchoHandler echoHandler = new EchoHandler();
        jettyServer.setHandler(echoHandler);
        jettyServer.start();

    }

    @AfterClass
    public static void jettyStop() throws Exception {
        jettyServer.stop();
    }

    @Test
    public void postRequestWithData() throws IOException {
        final HttpClient httpClient = new DefaultHttpClient();
        final HttpPost post = new HttpPost("http://localhost:8080");
        final String requestBody = "Hello world";
        post.setEntity(new StringEntity(requestBody));

        final HttpResponse response = httpClient.execute(post);
        final int statusCode = response.getStatusLine().getStatusCode();

        final InputStream responseBodyStream = response.getEntity().getContent();
        final StringWriter stringWriter = new StringWriter();

        IOUtils.copy(responseBodyStream, stringWriter);
        final String receivedBody = stringWriter.toString();

        Assert.assertEquals(200, statusCode);
        Assert.assertEquals(requestBody, receivedBody);
    }
}
