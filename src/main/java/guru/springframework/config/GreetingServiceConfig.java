package guru.springframework.config;

import guru.springframework.repository.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    /**
     * Her bir dile ait greeting service'leri burada ayağa kaldırıyorum.
     * Bunun için önce bir service factory sınıfından bean yaratıyorum.
     * daha sonra bu bean'in createService methodu ile her dile uygun bir service yaratıyorum.
     * @param repository
     * @return
     */

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        System.out.println("this repo works");
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

    //repoyu kendisi bağlıyor annotation ile
    @Bean(name = "basePrimaryGreetingService")
    GreetingService basePrimaryGreetingService(GreetingRepository repository){
        return new GreetingServiceImpl(repository);
    }
}
