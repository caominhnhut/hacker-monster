package com.gls.hm.user.factory;

import java.util.function.Function;

import com.gls.hm.persistent.entity.user.User;
import com.gls.hm.user.dto.RegisteredUser;

public class Mapper
{
	private static Function<RegisteredUser, User> registeredUserToUserEntity = registeredUser -> {
		User user = new User();
		user.setEmail(registeredUser.getEmail());
		user.setPassword(registeredUser.getPassword());
		return user;
	};

	private static Function<User, RegisteredUser> userEntityToRegisteredUser = userEntity -> {
		return new RegisteredUser(userEntity.getId(), userEntity.getEmail(), userEntity.getPassword());
	};

	public static User from(RegisteredUser userRequest)
	{
		return registeredUserToUserEntity.apply(userRequest);
	}

	public static RegisteredUser from(User user)
	{
		return userEntityToRegisteredUser.apply(user);
	}
}
