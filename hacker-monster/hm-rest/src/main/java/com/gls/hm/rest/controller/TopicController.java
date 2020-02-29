package com.gls.hm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gls.hm.topic.model.Topic;
import com.gls.hm.topic.service.TopicService;

@Controller
public class TopicController
{
	@Autowired
	private TopicService topicService;

	@RequestMapping(value = "no-auth/topic/all", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Topic>> getAll()
	{
		List<Topic> topics = topicService.getAll();

		return ResponseEntity.ok(topics);
	}
}
