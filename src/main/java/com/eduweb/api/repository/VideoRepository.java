package com.eduweb.api.repository;

import com.eduweb.api.models.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<VideoEntity, Integer> {
    List<VideoEntity> findAllByVideoName(String videoName);
}
