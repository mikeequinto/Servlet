package ch.hesge.programmation.apiServlet.exo33;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect2")
public class RedirectServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("Location", "https://google.com");
        //resp.setHeader("Location", "https://google.com");
        //resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
        resp.sendError(301);
    }
}
