package guru.springframework.controllers;

import guru.springframework.repository.GreetingRepository;
import guru.springframework.repository.GreetingRepositoryImpl;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController getterInjectedController;
    private GreetingRepository repository;

    @Before
    public void setUp() throws Exception {
        repository=new GreetingRepositoryImpl();
        this.getterInjectedController = new SetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl(repository));
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingRepositoryImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}