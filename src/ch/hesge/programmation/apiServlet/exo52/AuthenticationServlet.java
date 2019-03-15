package ch.hesge.programmation.apiServlet.exo52;

import ch.hesge.programmation.apiServlet.exo51.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/auth/login")
public class AuthenticationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println(firstName + " : " + lastName);

        Person p = new Person(firstName, lastName);

        HttpSession session = req.getSession(true);
        session.setAttribute("currentSessionUser", p);
        req.getRequestDispatcher("/WEB-INF/main.jsp")
                .forward(req,resp);
    }

}

