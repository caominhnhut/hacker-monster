package com.gls.hm.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gls.hm.feed.model.Feed;
import com.gls.hm.feed.service.FeedService;
import com.gls.hm.topic.model.Topic;
import com.gls.hm.topic.service.TopicService;

@Controller
public class FeedController
{
	@Autowired
	private FeedService feedService;

	@RequestMapping(value = "feed", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Feed> getAll(@RequestBody @Valid Feed feed)
	{
		return new ResponseEntity<>(feedService.create(feed), HttpStatus.CREATED);
	}
}
