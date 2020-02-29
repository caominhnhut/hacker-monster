package com.gls.hm.feed.service.impl;

import java.sql.SQLDataException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.gls.hm.feed.exception.HKException;
import com.gls.hm.feed.model.Feed;
import com.gls.hm.feed.model.User;
import com.gls.hm.feed.service.FeedService;
import com.gls.hm.persistent.entity.FeedEntity;
import com.gls.hm.persistent.entity.UserEntity;
import com.gls.hm.persistent.repository.feed.FeedRepository;

@Service
public class FeedServiceImpl implements FeedService
{
	private Logger logger = LoggerFactory.getLogger(FeedService.class);

	@Autowired
	private FeedRepository feedRepository;

	@Override
	public Feed create(Feed feed)
	{
		UserEntity userEntity = (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		FeedEntity feedEntity = new FeedEntity();
		feedEntity.setDescription(feed.getDescription());
		feedEntity.setOwner(userEntity);
		feedEntity.setNumOfLike(feed.getNumOfLike());
		feedEntity.setNumOfSharing(feed.getNumOfSharing());

		try
		{
			FeedEntity createdFeed = feedRepository.create(feedEntity);
			feed.setId(createdFeed.getId());
			User user = new User(userEntity.getId(), userEntity.getEmail(), userEntity.getDescription());
			feed.setOwner(user);
		}
		catch (Exception e)
		{
			logger.error("Can not create a feed");
			throw new HKException(e.getMessage());
		}

		return feed;
	}
}
