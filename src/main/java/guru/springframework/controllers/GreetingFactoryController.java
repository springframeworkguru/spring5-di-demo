package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingFactoryController {

    private final GreetingService greetingService;

    public GreetingFactoryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
