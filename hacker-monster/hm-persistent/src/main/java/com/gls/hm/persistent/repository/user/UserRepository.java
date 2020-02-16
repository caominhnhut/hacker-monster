package com.gls.hm.persistent.repository.user;

import java.util.List;

import com.gls.hm.persistent.entity.user.Authority;
import com.gls.hm.persistent.entity.user.User;
import com.gls.hm.persistent.repository.common.GenericJPADao;

public interface UserRepository extends GenericJPADao<User>
{
	List<User> getByCriteria();

	List<Authority> getAllAuthorities();
}
