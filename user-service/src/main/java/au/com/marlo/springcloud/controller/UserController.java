package au.com.marlo.springcloud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import au.com.marlo.springcloud.model.User;
import au.com.marlo.springcloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// @PreAuthorize("#oauth2.hasScope('server') or #name.equals('demo')")
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public User getUserByLogin(@RequestParam String login) {
		return userService.findByLogin(login);
	}

	@RequestMapping(path = "/create", method = RequestMethod.POST)
	public User createNewAccount(@Valid @RequestBody User user) {
		return userService.create(user);
	}

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public List<User> list() {
		return userService.listAll();
	}
	
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello() {
		return userService.hello();
	}
	
}
