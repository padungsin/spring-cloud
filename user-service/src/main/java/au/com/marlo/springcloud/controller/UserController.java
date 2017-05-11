package au.com.marlo.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import au.com.marlo.springcloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello() {
		return userService.sayHello();
	}

}
