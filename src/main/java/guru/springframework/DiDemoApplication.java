package guru.springframework;

import guru.springframework.controllers.GreetingFactoryController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		//System.out.println(controller.hello());
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		//System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		//System.out.println(fakeJmsBroker.getUsername());

		System.out.println("property injection:");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayHello());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayHello());

		GreetingFactoryController greetingFactoryController=(GreetingFactoryController) ctx.getBean("greetingFactoryController");
		System.out.println(greetingFactoryController.sayHello());

		System.out.println("dependecy injection :");
		GreetingService greetingService=(GreetingServiceImpl) ctx.getBean("basePrimaryGreetingService");
		System.out.println(greetingService.sayGreeting());
	}
}
