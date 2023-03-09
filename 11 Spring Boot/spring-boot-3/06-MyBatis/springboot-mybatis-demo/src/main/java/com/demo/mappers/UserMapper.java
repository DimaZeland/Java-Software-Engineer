/**
 * 
 */
package com.demo.mappers;

import java.util.List;

import com.demo.domain.User;


public interface UserMapper
{

	void insertUser(User user);

	User findUserById(Integer id);

	List<User> findAllUsers();
	
}
