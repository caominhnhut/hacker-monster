package com.gls.hm.topic.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gls.hm.persistent.entity.TopicEntity;
import com.gls.hm.persistent.repository.topic.TopicRepository;
import com.gls.hm.topic.model.Topic;
import com.gls.hm.topic.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService
{
	@Autowired
	private TopicRepository topicRepository;

	@Override
	public List<Topic> getAll()
	{
		List<TopicEntity> topicEntities = topicRepository.findAll();
		return topicEntities.stream().map(this::map).collect(Collectors.toList());
	}

	private Topic map(TopicEntity topicEntity)
	{
		return new Topic(topicEntity.getId(), topicEntity.getName());
	}
}
