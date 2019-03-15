package ch.hesge.programmation.apiServlet.exo51;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;


@WebFilter("/person/json")
public class JsonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(req, res);

        Person p = (Person)req.getAttribute("person");
        String personJsonString = "{'person':" +
                                    "{'firstName':"+p.firstName+"," +
                                    "'lastName':"+p.lastName+"}}";

        PrintWriter out = res.getWriter();
        res.setContentType("application/json");
        out.print(personJsonString);
        out.flush();

        /*
        JSONWriter out = res.getWriter();
        out.println("{");
        out.println("person : {");
        out.println("firstName : " +p.firstName);
        out.println("lastName : " +p.lastName);
        out.println("}");
        out.println("}");*/
    }

    @Override
    public void destroy() {

    }
}
