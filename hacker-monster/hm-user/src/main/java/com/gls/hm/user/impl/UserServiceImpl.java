package com.gls.hm.user.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gls.hm.persistent.repository.user.UserRepository;
import com.gls.hm.user.dto.RegisteredUser;
import com.gls.hm.user.factory.Mapper;
import com.gls.hm.user.model.User;
import com.gls.hm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Autowired
	@Lazy
	private PasswordEncoder passwordEncoder;

	@Override
	public List<User> getAll()
	{
		return Arrays.asList(new User("nhut-nguyen", "nhut.nguyen@gmail.com"), new User("vi-huynh", "vihuynh@gmail.com"));
	}

	@Override
	public RegisteredUser create(RegisteredUser registeredUser)
	{
		com.gls.hm.persistent.entity.user.User user = Mapper.from(registeredUser);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user = userRepository.create(user);
		user.setPassword(null);
		return Mapper.from(user);
	}
}
