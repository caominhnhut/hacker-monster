package com.gls.hm.persistent.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.validator.constraints.NotEmpty;

import com.gls.hm.persistent.entity.common.BaseTimestamp;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "users_seq", initialValue = 1)
public class User extends BaseTimestamp
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
	private Long id;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
