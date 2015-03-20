package com.gmail.wguo1990.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.wguo1990.models.User;
import com.gmail.wguo1990.services.UserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;


@Api(value = "users")
@RestController
@RequestMapping("/users/")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "create a new user" )
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User create(@RequestBody User user){
		return userService.create(user);
	}
	
	@ApiOperation(value = "update an existing user")
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@PathVariable(value = "userId") String userId, @RequestBody User user){
		userService.update(user);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User get(@RequestParam(value = "userId") String userId){
		return userService.get(userId);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE)
	public void update(@PathVariable(value = "userId") String userId){
		userService.delete(userId);
	}
	
}
