package ch.hesge.programmation.apiServlet.exo71;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet("/stockage")
public class StockageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/test.jsp")
                .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if(session == null){
            //Create session
            req.getSession(true);
        }

        String type = req.getParameter("type");

        if(type != null){
            switch (type){
                case "object" :
                    storeObject(session);
                    break;
                case "date" :
                    storeDate(session);
                    break;
                case "array":
                    storeArray(session);
                    break;
                case "list" :
                    storeList(session);
                    break;
                default:
                    System.out.println("wrong type!");
            }
        }else{
            System.out.println("select a type");
        }

        resp.sendRedirect(req.getContextPath() + "/stockage");

    }

    private void storeObject(HttpSession session){
        session.setAttribute("object", new Object());
    }

    private void storeDate(HttpSession session){
        session.setAttribute("date", new Date());
    }

    private void storeArray(HttpSession session){
        System.out.println("hi");
        ArrayList array = new ArrayList();
        array.add(new Object());
        array.add(new Object());
        array.add(new Date());
        session.setAttribute("array", array);
    }

    private void storeList(HttpSession session){
        List list = Arrays.asList(new Object(), new Object(), new Date());
        session.setAttribute("list", list);
    }
}
