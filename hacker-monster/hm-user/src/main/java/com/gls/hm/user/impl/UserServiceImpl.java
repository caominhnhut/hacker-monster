package com.gls.hm.user.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gls.hm.user.model.User;
import com.gls.hm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Override
	public List<User> getAll()
	{
		return Arrays.asList(new User("nhut-nguyen", "nhut.nguyen@gmail.com"), new User("vi-huynh", "vihuynh@gmail.com"));
	}
}
