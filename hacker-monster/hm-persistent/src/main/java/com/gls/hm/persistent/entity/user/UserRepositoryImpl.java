package com.gls.hm.persistent.entity.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public UserEntity create(UserEntity user) {
        em.persist(user);
        return user;
    }
}
