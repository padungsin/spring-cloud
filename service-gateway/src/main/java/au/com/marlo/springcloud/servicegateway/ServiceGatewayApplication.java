package au.com.marlo.springcloud.servicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import au.com.marlo.springcloud.servicegateway.filter.pre.SimpleFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableConfigurationProperties
public class ServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceGatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
