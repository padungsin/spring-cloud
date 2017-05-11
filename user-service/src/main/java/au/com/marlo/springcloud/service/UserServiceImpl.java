package au.com.marlo.springcloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.marlo.springcloud.config.GreetingBean;

@Service
public class UserServiceImpl implements UserService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private GreetingBean greetingBean;

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingBean.sayHello();
	}

}
