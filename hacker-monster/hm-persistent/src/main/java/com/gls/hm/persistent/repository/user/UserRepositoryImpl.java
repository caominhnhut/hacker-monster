package com.gls.hm.persistent.repository.user;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gls.hm.persistent.entity.user.User;
import com.gls.hm.persistent.repository.common.AbstractJPADao;

@Repository
@Transactional
public class UserRepositoryImpl extends AbstractJPADao<User> implements UserRepository
{
	@Override
	public List<User> getByCriteria()
	{
		return null;
	}
}
