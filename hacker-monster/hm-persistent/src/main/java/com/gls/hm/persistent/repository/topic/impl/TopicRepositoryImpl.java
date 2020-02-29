package com.gls.hm.persistent.repository.topic.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.gls.hm.persistent.entity.TopicEntity;
import com.gls.hm.persistent.repository.common.AbstractGenericDao;
import com.gls.hm.persistent.repository.topic.TopicRepository;

@Repository
public class TopicRepositoryImpl extends AbstractGenericDao<TopicEntity> implements TopicRepository
{
	@PostConstruct
	public void init()
	{
		super.setClazz(TopicEntity.class);
	}
}
