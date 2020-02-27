package com.gls.hm.persistent.repository.user;

import java.util.List;

import com.gls.hm.persistent.entity.Authority;
import com.gls.hm.persistent.entity.UserEntity;
import com.gls.hm.persistent.repository.common.GenericDao;

public interface UserRepository extends GenericDao<UserEntity>
{
	List<Authority> getAllAuthorities();

	UserEntity findByEmail(String email);
}
