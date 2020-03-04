package com.gls.hm.persistent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
@SequenceGenerator(name = "topic_seq", initialValue = 1)
public class Topic
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topic_seq")
	private Long id;

	@Column(name = "topic_name")
	private String name;

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
}
