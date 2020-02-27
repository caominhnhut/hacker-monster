package com.gls.hm.persistent.entity;

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

@Entity
@Table(name = "comment")
@SequenceGenerator(name = "comment_seq", initialValue = 1)
public class Comment extends BaseTimestamp
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
	private Long id;

	@Column(name = "description")
	@Lob
	private String description;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private UserEntity owner;

	@ManyToOne
	@JoinColumn(name = "feed_id")
	private Feed feed;

	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
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

	public Feed getFeed()
	{
		return feed;
	}

	public void setFeed(Feed feed)
	{
		this.feed = feed;
	}

	public Article getArticle()
	{
		return article;
	}

	public void setArticle(Article article)
	{
		this.article = article;
	}
}
