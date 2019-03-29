package ch.hesge.programmation.apiServlet.exo91;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


@WebServlet("/externalisation")
public class ExternalisationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("locale");
        Locale locale = new Locale(param);
        req.getSession().setAttribute("locale", locale);
        req.getRequestDispatcher("/externalisation.jsp")
                .forward(req, resp);
    }
}
