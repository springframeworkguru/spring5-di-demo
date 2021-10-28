package guru.springframework.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("I'm creating singleton bean");
    }

    public String getMyScope(){
        return "singleton scope";
    }
}
