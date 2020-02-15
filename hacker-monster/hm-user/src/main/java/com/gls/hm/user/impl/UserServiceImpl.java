package com.gls.hm.user.impl;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gls.hm.persistent.repository.user.UserRepository;
import com.gls.hm.user.dto.RegisteredUser;
import com.gls.hm.user.factory.Mapper;
import com.gls.hm.user.model.User;
import com.gls.hm.user.service.UserService;
import com.google.common.base.Throwables;

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
		try
		{
			user = userRepository.create(user);
		}
		catch (RuntimeException e)
		{
			Throwable rootCause = Throwables.getRootCause(e);
			if(rootCause instanceof PSQLException)
			{
				throw new IllegalStateException(rootCause.getMessage());
			}
			throw new IllegalStateException(e.getMessage());
		}
		return Mapper.from(user);
	}
}
