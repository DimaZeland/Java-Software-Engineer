package com.demo;

import java.util.Arrays;
import java.util.List;


public class JdbcUserDAO implements UserDAO
{

	@Override
	public List<String> getAllUserNames()
	{
		System.out.println("**** Getting usernames from RDBMS *****");
		return Arrays.asList("Siva","Prasad","Reddy");
	}

}
