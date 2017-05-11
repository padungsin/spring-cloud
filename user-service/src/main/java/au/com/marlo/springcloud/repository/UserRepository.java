package au.com.marlo.springcloud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import au.com.marlo.springcloud.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByLogin(String login);
	public List<User> findAll();
}
