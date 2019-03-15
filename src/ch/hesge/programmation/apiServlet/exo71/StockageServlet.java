package ch.hesge.programmation.apiServlet.exo71;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet("/stockage")
public class StockageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/WEB-INF/test.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if(session == null){
            //Create session
            session = req.getSession(true);
        }

        if(session.getId() != null){
            Object object = new Object();
            Date date = new Date();
            //Array array = {new Object(), new Object(), new Date()};
            List list = Arrays.asList(new Object(), new Object(), new Date());

            session.setAttribute("object", object);
            session.setAttribute("date", date);
            session.setAttribute("list", list);

            System.out.println(session.getAttribute("date"));

        }


    }

}
