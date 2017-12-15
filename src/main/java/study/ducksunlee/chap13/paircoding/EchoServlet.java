package study.ducksunlee.chap13.paircoding;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LSD on 2017-12-15.
 */
public class EchoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setStatus(HttpServletResponse.SC_OK);

        final ServletInputStream inputStream = req.getInputStream();
        final ServletOutputStream outputStream = resp.getOutputStream();

        IOUtils.copy(inputStream, outputStream);
//        super.doPost(req, resp);
    }
}
