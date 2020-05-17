package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {
    @Value("${guru.user}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;
    @Value("${guru.jms.user}")
    String jmsUser;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
    @Bean
    public FakeJmsDataSource fakeJmsDataSource(){
        FakeJmsDataSource fakeJmsDataSource=new FakeJmsDataSource();
        fakeJmsDataSource.setUser(jmsUser);
        fakeJmsDataSource.setPassword(jmsPassword);
        fakeJmsDataSource.setUrl(jmsUrl);
        return fakeJmsDataSource;
    }

}
