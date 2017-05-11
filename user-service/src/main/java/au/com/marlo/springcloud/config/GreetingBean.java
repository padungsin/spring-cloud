package au.com.marlo.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingBean {

	@Value("${clientapp.greeting.message}")
	private String message;

	public String sayHello() {
		return "Hello; this is : " + message;

	}

}
