package com.gls.hm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gls.hm.user.dto.RegisteredUser;
import com.gls.hm.user.model.User;
import com.gls.hm.user.service.UserService;

@Controller
@RequestMapping(value = "/user/")
public class UserController
{
	@Autowired
	private UserService userService;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "all", method = RequestMethod.GET)
	@ResponseBody
	public List<User> findUser()
	{
		return userService.getAll();
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<RegisteredUser> register(@RequestBody RegisteredUser userDto)
	{
		userDto = userService.create(userDto);
		return new ResponseEntity<>(userDto, HttpStatus.CREATED);
	}
}
