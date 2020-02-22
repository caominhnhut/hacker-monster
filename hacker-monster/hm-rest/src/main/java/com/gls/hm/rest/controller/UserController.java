package com.gls.hm.rest.controller;

import java.util.List;

import com.gls.hm.user.dto.RegisteredUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value="register", method = RequestMethod.POST)
	@ResponseBody
	public RegisteredUser register(@RequestBody RegisteredUser registeredUser){
		return userService.create(registeredUser);
	}


}
