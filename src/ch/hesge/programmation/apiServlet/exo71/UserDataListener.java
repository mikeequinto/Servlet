package ch.hesge.programmation.apiServlet.exo71;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.Collection;

@WebListener
public class UserDataListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("new user data!");

        /*if((httpSessionBindingEvent.getClass()).isArray()){
            System.out.println("is array");
        }else{
            System.out.println("attribut : "+httpSessionBindingEvent.getName());
        }

        System.out.println("value : "+httpSessionBindingEvent.getValue());*/

        log(httpSessionBindingEvent);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    private void log(HttpSessionBindingEvent event){
        String name = event.getName();
        Object value = event.getValue();
        if(value instanceof Collection){
            Collection collection = (Collection)value;
            for (Object v : collection){
                System.out.println("key : " + name + "; value : " + v );
            }
        } else if (value instanceof Object[]) {
            Object[] array = (Object[]) value;
            for(int i = 0; i < array.length; i++){
                System.out.println();
            }

        }else{
            System.out.println("key : " + name + "; value : " + value );
        }
    }
}
