package au.com.marlo.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApplicationConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "clientapp.greeting")
	public GreetingBean greetingBean(){
		
		return new GreetingBean();
	}
}
