package com.gls.hm.persistent.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Calendar;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "users_seq", initialValue = 1)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_date")
    private Calendar createdDate = Calendar.getInstance();
`
package com.gls.hm.persistent.entity.common;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.common.collect.ComparisonChain;

@MappedSuperclass
public abstract class BaseTimestamp implements Serializable, Comparable<BaseTimestamp>
{
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, name = "timestamp_created")
	private Calendar timestampCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, name = "timestamp_modified")
	private Calendar timestampModified;

	@PrePersist
	protected void onCreate()
	{
		timestampCreated = Calendar.getInstance();
		timestampModified = Calendar.getInstance();
	}

	@PreUpdate
	protected void onUpdate()
	{
		timestampModified = Calendar.getInstance();
	}

	public Calendar getTimestampCreated()
	{
		return timestampCreated;
	}

	public Calendar getTimestampModified()
	{
		return timestampModified;
	}

	@Override
	public int compareTo(BaseTimestamp o)
	{
		if (o == null || o.timestampCreated == null || o.timestampModified == null)
		{
			return -1;
		}

		return ComparisonChain.start()
				.compare(o.timestampCreated, timestampCreated)
				.compare(o.timestampModified, timestampModified)
				.result();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}

		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		BaseTimestamp that = (BaseTimestamp) o;

		return Objects.equals(timestampCreated, that.timestampCreated) && Objects.equals(timestampModified, that.timestampModified);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(timestampCreated, timestampModified);
	}
}
`
    @Column(name = "modified_date")
    private Calendar modifiedDate = Calendar.getInstance();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
