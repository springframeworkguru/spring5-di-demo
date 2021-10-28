package guru.springframework.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("I'm prototype bean");
    }

    public String getMyScope(){
        return "this is prototype scope";
    }
}
