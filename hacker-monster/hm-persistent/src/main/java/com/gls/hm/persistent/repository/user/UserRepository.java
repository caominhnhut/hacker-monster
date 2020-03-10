package com.gls.hm.persistent.repository.user;

import com.gls.hm.persistent.entity.UserEntity;
import com.gls.hm.persistent.repository.common.GenericDao;

public interface UserRepository extends GenericDao<UserEntity>
{
	UserEntity findByEmail(String email);
}
