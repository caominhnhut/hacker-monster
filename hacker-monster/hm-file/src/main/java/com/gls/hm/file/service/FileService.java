package com.gls.hm.file.service;

import org.springframework.web.multipart.MultipartFile;

import com.gls.hm.persistent.entity.FileEntity;

public interface FileService
{
    FileEntity store(MultipartFile file);

    FileEntity findById(Long id);
}
