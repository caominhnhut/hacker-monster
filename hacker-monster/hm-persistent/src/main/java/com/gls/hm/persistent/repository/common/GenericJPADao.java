package com.gls.hm.persistent.repository.common;

import java.io.Serializable;
import java.util.List;

public interface GenericJPADao<T extends Serializable>
{
	T findOne(long id);

	List<T> findAll();

	T create(T entity);

	T update(T entity);

	void delete(T entity);

	void deleteById(long entityId);
}
