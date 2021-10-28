package guru.springframework.controllers;

import guru.springframework.repository.GreetingRepository;
import guru.springframework.repository.GreetingRepositoryImpl;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    /**
     * spring framework gibi davranarak ioc uygulamasını kendimiz gerçekleştiriyoruz.
     * PropertyInjectedController'ın GreetingService'e ihtiyacı var ve biz bu
     * dependency'i somut olarak GreetingServiceImpl() yaratarak veriyoruz.
     * Bu sınıf bu somut nesneyi kullanıyor.
     */
    private PropertyInjectedController propertyInjectedController;
    private GreetingRepository repository;

    @Before
    public void setUp() throws Exception {
        repository=new GreetingRepositoryImpl();
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl(repository);
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingRepositoryImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}