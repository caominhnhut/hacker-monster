package com.gls.hm.persistent.repository.user;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gls.hm.persistent.entity.user.Authority;
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

	@Override
	public List<Authority> getAllAuthorities()
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Authority> cq = cb.createQuery(Authority.class);
		Root<Authority> authority = cq.from(Authority.class);
		cq.select(authority);
		TypedQuery<Authority> query = em.createQuery(cq);
		return query.getResultList();
	}
}
