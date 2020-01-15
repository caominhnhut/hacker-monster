package com.gls.hm.user.model;

import org.springframework.security.core.GrantedAuthority;

import com.gls.hm.user.enumvalue.RoleName;

public class Role implements GrantedAuthority
{

	private RoleName name;

	public void setName(RoleName name)
	{
		this.name = name;
	}

	@Override
	public String getAuthority()
	{
		return name.name();
	}
}
