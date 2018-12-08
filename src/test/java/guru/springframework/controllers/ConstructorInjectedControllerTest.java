package guru.springframework.controllers;

import guru.springframework.services.ConstructorGreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testGreeting() throws Exception {
        System.out.println(constructorInjectedController.sayHello());
        assertEquals(ConstructorGreetingService.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}