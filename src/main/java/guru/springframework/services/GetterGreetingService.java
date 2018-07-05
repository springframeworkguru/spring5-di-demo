package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class GetterGreetingService implements GreetingService {

    public static final String HELLO_GURUS = "Hello - I was injected by the getter";

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
