package com.gls.hm.user.impl;

import java.util.Arrays;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gls.hm.user.enumvalue.RoleName;
import com.gls.hm.user.model.Role;
import com.gls.hm.user.model.User;

@Service
public class UserDetailService implements UserDetailsService
{
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		User user = new User();
		user.setUsername(username);
		user.setPassword("$2a$10$T/QlWO0YaEsRRx5T3FSobefegUeiRKinqTzh9WcPHOVJCYgEGkYEu");
		user.setEmail(String.format("%s@gmail.com", username));

		Role role = new Role();
		role.setName(RoleName.ROLE_STUDENT);
		if (username.equalsIgnoreCase("admin"))
		{
			role.setName(RoleName.ROLE_ADMIN);
		}
		user.setAuthorities(Arrays.asList(role));

		return user;
	}
}
