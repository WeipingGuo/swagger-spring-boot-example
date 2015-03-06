package com.gmail.wguo1990.services;

import com.gmail.wguo1990.models.User;

public interface UserService {
	
	/**
	 *	create a new user  
	 */
	public User create(final User user);
	
	/**
	 * get a user by its id 
	 */
	public User get(final String userId);
	
	
	/**
	 * update an existing user
	 */
	public void update(User user);
	
	/**
	 * delete a user resource
	 */
	public void delete(final String userId);

}
