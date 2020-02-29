package com.gls.hm.persistent.repository.feed.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.gls.hm.persistent.entity.FeedEntity;
import com.gls.hm.persistent.entity.TopicEntity;
import com.gls.hm.persistent.repository.common.AbstractGenericDao;
import com.gls.hm.persistent.repository.feed.FeedRepository;

@Repository
public class FeedRepositoryImpl extends AbstractGenericDao<FeedEntity> implements FeedRepository
{
	@PostConstruct
	public void init()
	{
		super.setClazz(FeedEntity.class);
	}
}
