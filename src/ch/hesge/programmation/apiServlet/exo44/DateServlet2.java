package ch.hesge.programmation.apiServlet.exo44;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/date2")
public class DateServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Date d = new Date();
        req.setAttribute("date", d);

        req.getRequestDispatcher("/WEB-INF/date2.jsp")
                .forward(req,resp);

    }
}
