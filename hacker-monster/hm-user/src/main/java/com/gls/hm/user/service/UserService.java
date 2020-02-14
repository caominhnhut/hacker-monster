package com.gls.hm.user.service;

import java.util.List;

import com.gls.hm.user.dto.RegisteredUser;
import com.gls.hm.user.model.User;

public interface UserService
{
	List<User> getAll();
	RegisteredUser create(RegisteredUser registeredUser);
}
