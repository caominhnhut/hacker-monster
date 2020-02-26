package com.gls.hm.persistent.entity.topic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.gls.hm.persistent.entity.common.BaseTimestamp;
import com.gls.hm.persistent.entity.user.UserEntity;

@Entity
@Table(name = "article")
@SequenceGenerator(name = "article_seq", initialValue = 1)
public class Article extends BaseTimestamp
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	@Lob
	private String description;

	@ManyToOne
	@JoinColumn(name="owner_id")
	private UserEntity owner;

	@ManyToOne
	@JoinColumn(name="topic_id")
	private Topic topic;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public UserEntity getOwner()
	{
		return owner;
	}

	public void setOwner(UserEntity owner)
	{
		this.owner = owner;
	}

	public Topic getTopic()
	{
		return topic;
	}

	public void setTopic(Topic topic)
	{
		this.topic = topic;
	}
}
