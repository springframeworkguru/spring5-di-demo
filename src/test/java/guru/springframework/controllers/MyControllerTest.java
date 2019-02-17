package guru.springframework.controllers;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "default" )
public class MyControllerTest {

    @Autowired
    private MyController mycontroller;


    @Test
    public void testEnGreeting() throws Exception{
        String result = mycontroller.hello();
        assertNotEquals("Hello - Primary Greeting service", result);
    }

    @Test
    public void testDeGreeting() throws Exception{
        String result = mycontroller.hello();
        assertEquals("Primärer Grußdienst", result);
    }
}
