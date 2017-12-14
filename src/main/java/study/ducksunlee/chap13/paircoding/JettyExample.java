package study.ducksunlee.chap13.paircoding;

import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;


import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LSD on 2017-12-12.
 */
public class JettyExample {
    public static void main(String[] args) throws Exception {
        final Server jettyServer = new Server(8080);
        jettyServer.setHandler(new EchoHandler());
        jettyServer.start();
        jettyServer.join();
    }


}

class EchoHandler extends AbstractHandler {


    @Override
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/plan");
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        request.setHandled(true);

        final ServletInputStream requestInputStrem = httpServletRequest.getInputStream();
        final ServletOutputStream reponseOutputStream = httpServletResponse.getOutputStream();

        IOUtils.copy(requestInputStrem, reponseOutputStream);
    }
}
