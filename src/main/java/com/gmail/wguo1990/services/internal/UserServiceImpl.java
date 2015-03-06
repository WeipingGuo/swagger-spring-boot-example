package com.gmail.wguo1990.services.internal;

import org.springframework.stereotype.Service;

import com.gmail.wguo1990.models.User;
import com.gmail.wguo1990.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User create(User user) {
		return user;
	}

	@Override
	public User get(String userId) {
		
		User user = new User();
		user.setId("123456");
		user.setFirstName("Weiping");
		user.setLastName("Guo");
		return user;
	}

	@Override
	public void update(User user) {

	}

	@Override
	public void delete(String userId) {

	}

}
