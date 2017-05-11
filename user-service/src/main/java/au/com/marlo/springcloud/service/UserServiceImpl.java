package au.com.marlo.springcloud.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.marlo.springcloud.config.GreetingBean;
import au.com.marlo.springcloud.model.User;
import au.com.marlo.springcloud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private GreetingBean greetingBean;

	@Override
	public User findByLogin(String login) {
		return userRepository.findByLogin(login);
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User saveChanges(User user) {
		return userRepository.save(user);

	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub

		return userRepository.findAll();
	}

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return greetingBean.sayHello();
	}

}
