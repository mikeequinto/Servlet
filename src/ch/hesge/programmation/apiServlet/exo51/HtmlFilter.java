package ch.hesge.programmation.apiServlet.exo51;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/person/html")
public class HtmlFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(req, res);

        Person p = (Person)req.getAttribute("person");

        req.setAttribute("firstName", p.firstName);
        req.setAttribute("lastName", p.lastName);

        req.getRequestDispatcher("/person.jsp")
                .forward(req,res);

    }

    @Override
    public void destroy() {

    }
}
