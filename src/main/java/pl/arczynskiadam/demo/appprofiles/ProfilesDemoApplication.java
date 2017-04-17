package pl.arczynskiadam.demo.appprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.arczynskiadam.demo.appprofiles.service.DemoService;

@SpringBootApplication
public class ProfilesDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProfilesDemoApplication.class, args);
		DemoService demoService = (DemoService) context.getBean("demoService");
		demoService.action();
	}
}
