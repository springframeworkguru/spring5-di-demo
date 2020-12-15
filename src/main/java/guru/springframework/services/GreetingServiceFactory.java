package guru.springframework.services;

public class GreetingServiceFactory
{
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository)
    {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang)
    {
        switch (lang)
        {
            case "en":
            {
                return new PrimaryGreetingService(greetingRepository);
            }
            case "es":
            {
                return new PrimarySpanishGreetingService(greetingRepository);
            }
            case "de":
            {
                return new PrimaryGermanGreetingService(greetingRepository);
            }
            default:
            {
                return new PrimaryGreetingService(greetingRepository);
            }
        }
    }
}
