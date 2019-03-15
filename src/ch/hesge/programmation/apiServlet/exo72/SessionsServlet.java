package ch.hesge.programmation.apiServlet.exo72;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sessions")
public class SessionsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int count = getSessionCount(req);
        req.setAttribute("count", count);
        req.getRequestDispatcher("/sessions.jsp")
                .forward(req,resp);
    }

    private int getSessionCount(HttpServletRequest request){

        return 0;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        HttpSession session = req.getSession(false);

        switch (action){
            case "create":
                if (session == null){
                    session = req.getSession(true);
                }
                break;
            case "delete":
                session.invalidate();
                break;
        }

        resp.sendRedirect(req.getContextPath() + "/sessions.jsp");
    }
}

