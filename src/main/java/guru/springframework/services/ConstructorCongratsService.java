package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorCongratsService implements CongratService {

    public String sayCongrats(){
        return "I am constructor injected - congrats.";
    }

}
