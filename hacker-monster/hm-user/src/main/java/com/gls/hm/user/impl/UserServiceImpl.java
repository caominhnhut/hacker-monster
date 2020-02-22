package com.gls.hm.user.impl;

import java.util.Arrays;
import java.util.List;

import com.gls.hm.persistent.entity.user.UserEntity;
import com.gls.hm.persistent.entity.user.UserRepository;
import com.gls.hm.user.dto.RegisteredUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gls.hm.user.model.User;
import com.gls.hm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll()
	{
		return Arrays.asList(new User("nhut-nguyen", "nhut.nguyen@gmail.com"), new User("vi-huynh", "vihuynh@gmail.com"));
	}

	@Override
	public RegisteredUser create(RegisteredUser registeredUser) {
		UserEntity userEntity=new UserEntity();
		userEntity.setEmail(registeredUser.getUsername());
		userEntity.setPassword(registeredUser.getPassword());

		UserEntity userResult = userRepository.create(userEntity);

		registeredUser.setId(userResult.getId());

		return registeredUser;
	}
}
