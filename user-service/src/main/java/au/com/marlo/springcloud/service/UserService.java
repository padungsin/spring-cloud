package au.com.marlo.springcloud.service;

import java.util.List;

import au.com.marlo.springcloud.model.User;

public interface UserService {

	/**
	 * Finds account by given name
	 *
	 * @param accountName
	 * @return found account
	 */
	User findByLogin(String login);

	/**
	 * Checks if account with the same name already exists Invokes Auth Service
	 * user creation Creates new account with default parameters
	 *
	 * @param user
	 * @return created account
	 */
	User create(User user);

	/**
	 * Validates and applies incoming account updates Invokes Statistics Service
	 * update
	 *
	 * @param name
	 * @param update
	 */
	User saveChanges(User user);
	
	List<User> listAll();
	
	String hello();
}
