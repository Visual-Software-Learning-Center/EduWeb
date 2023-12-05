package com.eduweb.api.services;

import com.eduweb.api.dto.CreateVideoRequest;
import com.eduweb.api.dto.VideoDto;
import com.eduweb.api.mapper.VideoMapper;
import com.eduweb.api.models.VideoEntity;
import com.eduweb.api.repository.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    VideoRepository videoRepository;

    VideoMapper videoMapper;

    public List<VideoDto> getAllVideos(){
        List<VideoEntity> videoEntities = videoRepository.findAll();
        List<VideoDto> videosDtos = new ArrayList<>();
        for  (VideoEntity videosEntity: videoEntities){
            videosDtos.add(videoMapper.mapEntityToDto(videosEntity));
        }
        return videosDtos;
    }

    // since get all, we need to map each element from entity to dto
    public List<VideoDto> getVideosByTitle(String title){
        List<VideoEntity> videoEntities = videoRepository.findAllByVideoName(title);
        List<VideoDto> videosDtos = new ArrayList<>();
        for  (VideoEntity videosEntity: videoEntities){
            videosDtos.add(videoMapper.mapEntityToDto(videosEntity));
        }
        return videosDtos;
    }

    // for create/get 1 element, no need to loop and map

    public void createVideo(CreateVideoRequest createVideoRequest){
        videoRepository.save(videoMapper.mapCreateVideoRequestToEntity(createVideoRequest));
    }
}
