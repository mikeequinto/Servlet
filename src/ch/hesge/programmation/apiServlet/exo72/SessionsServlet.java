package ch.hesge.programmation.apiServlet.exo72;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

        HttpSession session = req.getSession(false);
        if (session == null){
            req.getSession(true);
        }

        int count = getSessionCount(req);
        req.setAttribute("count", count);
        req.getRequestDispatcher("/sessions.jsp")
                .forward(req,resp);
    }

    private int getSessionCount(HttpServletRequest request){
        int o = (Integer)request.getServletContext().getAttribute("count");
        return o;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        HttpSession session = req.getSession();

        if(action != null && action.equals("delete")){
            System.out.println("delete session");
            session.invalidate();
        }
        resp.sendRedirect("/sessions");
    }
}

