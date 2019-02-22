package guru.springframework.controllers;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectedControllerTest {

    @Autowired
    private ConstructorInjectedController constructorInjectedController;


    //The GreetingService is not expected to be injected.
    @Test(expected = NullPointerException.class)
    public void testGreeting() throws Exception{
         constructorInjectedController.sayHello();
    }

    @Test
    public void testCongrats() throws Exception {
        assertEquals("I am constructor injected - congrats." , constructorInjectedController.sayCongrat());
    }
}