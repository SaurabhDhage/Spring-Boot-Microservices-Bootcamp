package com.example.mockito_testing.dao;

import java.util.List;


import com.example.mockito_testing.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	List<User> findByAddress(String address);

}
