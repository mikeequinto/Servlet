package ch.hesge.programmation.apiServlet.exo51;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/person/xml")
public class XmlFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(req, res);

        Person p = (Person)req.getAttribute("person");

        res.setContentType("text/xml");
        PrintWriter out = res.getWriter();
        out.println("<person>");
        out.println("<firstName>"+p.firstName+"</firstName>");
        out.println("  <lastName>"+p.lastName+"</lastName>");
        out.println("</person>");
    }

    @Override
    public void destroy() {

    }
}
