package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.CongratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    private CongratService congratService;


     //@Autowired
     //IntelliJ says only one constructor can have autowired annotation
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

     @Autowired
     public ConstructorInjectedController (CongratService congratService){
        this.congratService = congratService;
     }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public String sayCongrat() {return congratService.sayCongrats();}
}
