package ch.hesge.programmation.apiServlet.exo72;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionsListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        incrementCount(httpSessionEvent);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session destroyed");
        decrementCount(httpSessionEvent);
    }

    private void incrementCount(HttpSessionEvent httpSessionEvent) {
        changeCount(httpSessionEvent, 1);
    }

    private void decrementCount(HttpSessionEvent httpSessionEvent) {
        changeCount(httpSessionEvent, -1);
    }

    private void changeCount(HttpSessionEvent httpSessionEvent, int value) {
        System.out.println("session event");
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        int current = getCount(httpSessionEvent);
        current += value;
        storeCount(context, current);
    }

    private int getCount(HttpSessionEvent event) {
        ServletContext context = event.getSession().getServletContext();
        Object o = context.getAttribute("count");
        if (o == null) {
            return 0;
        }
        return (Integer) o;
    }

    private void storeCount(ServletContext context, int count) {
        System.out.println("session count : " + count);
        context.setAttribute("count", count);
    }
}
