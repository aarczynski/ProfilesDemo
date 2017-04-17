package pl.arczynskiadam.demo.appprofiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.arczynskiadam.demo.appprofiles.service.CitDemoService;
import pl.arczynskiadam.demo.appprofiles.service.DemoService;
import pl.arczynskiadam.demo.appprofiles.service.DevDemoService;

@Configuration
public class DemoServiceConfig {

    @Bean(name = "demoService")
    @Profile("cit")
    public DemoService citDemoService() {
        return new CitDemoService();
    }

    @Bean(name = "demoService")
    @Profile("dev")
    public DemoService devDemoService() {
        return new DevDemoService();
    }
}
