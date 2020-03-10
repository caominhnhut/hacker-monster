package com.gls.hm.persistent.repository.file.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.gls.hm.persistent.entity.FileEntity;
import com.gls.hm.persistent.entity.TopicEntity;
import com.gls.hm.persistent.repository.common.AbstractGenericDao;
import com.gls.hm.persistent.repository.file.FileRepository;
import com.gls.hm.persistent.repository.topic.TopicRepository;

@Repository
public class FileRepositoryImpl extends AbstractGenericDao<FileEntity> implements FileRepository
{
    @PostConstruct
    public void init()
    {
        super.setClazz(FileEntity.class);
    }
}
