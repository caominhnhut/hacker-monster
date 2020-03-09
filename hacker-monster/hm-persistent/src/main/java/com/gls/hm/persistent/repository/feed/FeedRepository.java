package com.gls.hm.persistent.repository.feed;

import java.util.List;

import com.gls.hm.persistent.entity.FeedEntity;
import com.gls.hm.persistent.entity.TopicEntity;
import com.gls.hm.persistent.repository.common.GenericDao;

public interface FeedRepository extends GenericDao<FeedEntity>
{
    List<FeedEntity> getLatest(Long userId, int limit, int offset);
}
