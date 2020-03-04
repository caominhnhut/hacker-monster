package com.gls.hm.persistent.repository.user;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gls.hm.persistent.entity.UserEntity;
import com.gls.hm.persistent.repository.common.AbstractGenericDao;

@Repository
@Transactional
public class UserRepositoryImpl extends AbstractGenericDao<UserEntity> implements UserRepository
{
    @PostConstruct
    public void init()
    {
        super.setClazz(UserEntity.class);
    }

	@Override
	public UserEntity findByEmail(String email)
	{
		return null;
	}
}
