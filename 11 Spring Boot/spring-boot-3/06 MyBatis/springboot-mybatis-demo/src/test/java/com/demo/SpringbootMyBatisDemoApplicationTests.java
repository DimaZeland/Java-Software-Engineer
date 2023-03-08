package com.demo;

import com.demo.domain.User;
import com.demo.mappers.*;

import com.demo.mappers.UserMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest//(classes=SpringbootMyBatisDemoApplication.class)
public class SpringbootMyBatisDemoApplicationTests
{

	@Autowired private UserMapper userMapper;
	//@Autowired private UserAnnotationMapper userMapper;
	
	@Test
	public void findAllUsers()  {
		List<User> users = userMapper.findAllUsers();
		assertNotNull(users);
		assertTrue(!users.isEmpty());
		
	}
	
	@Test
	public void findUserById()  {
		User user = userMapper.findUserById(1);
		assertNotNull(user);
	}
	
	@Test
	@Disabled
	public void createUser() {
		User user = new User(10, "george", "george@gmail.com");
		userMapper.insertUser(user);
		User newUser = userMapper.findUserById(user.getId());
		assertEquals("george", newUser.getName());
		assertEquals("george@gmail.com", newUser.getEmail());
	}
}
