package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class PropertyInjectedControllerTest {

    /**
     * spring framework gibi davranarak ioc uygulamasını kendimiz gerçekleştiriyoruz.
     * PropertyInjectedController'ın GreetingService'e ihtiyacı var ve biz bu
     * dependency'i somut olarak GreetingServiceImpl() yaratarak veriyoruz.
     * Bu sınıf bu somut nesneyi kullanıyor.
     */
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}