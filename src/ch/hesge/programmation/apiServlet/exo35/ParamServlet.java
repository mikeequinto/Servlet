package ch.hesge.programmation.apiServlet.exo35;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/param")
public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();

        PrintWriter out = resp.getWriter();
        out.println("<html><body><h1>Params<table border=1><thead><tr><th>Param</th><th>Value(s)</th>");

        if(!params.isEmpty()){
            out.println("<tbody>");
        }

        for(Map.Entry<String, String[]> entry : params.entrySet()){
            out.println("<tr>");
            out.println("<td>");
            out.println(entry.getKey());
            out.println("</td>");
            out.println("<td>");
            String[] values = entry.getValue();
            switch (values.length){
                case 0:
                    break;
                case 1:
                    out.println(values[0]);
                    break;
                default:
                    out.println("<ul>");
                    for(String value : values){
                        out.println("<li>" + value + "</li>");
                    }
                    break;
            }
            out.println("</td>");
            out.println("</tr>");
        }

    }
}
