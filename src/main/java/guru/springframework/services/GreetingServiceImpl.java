package guru.springframework.services;

import guru.springframework.repository.GreetingRepository;

public class GreetingServiceImpl implements GreetingService {

    private final GreetingRepository repository;

    public GreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getBaseGreeting();
    }
}
