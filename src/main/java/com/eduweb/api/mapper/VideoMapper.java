package com.eduweb.api.mapper;

import com.eduweb.api.dto.VideoDto;
import com.eduweb.api.dto.CreateVideoRequest;
import com.eduweb.api.models.VideoEntity;

public class VideoMapper {
    public VideoDto mapEntityToDto(VideoEntity videoEntity){
        VideoDto videoDto= new VideoDto();
        videoDto.setVideoName(videoEntity.getVideoName());
        videoDto.setVideoLink(videoEntity.getVideoLink());
        return videoDto;
    }

    public VideoEntity mapCreateVideoRequestToEntity(CreateVideoRequest createVideoRequest){
        VideoEntity videosEntity = new VideoEntity();
        videosEntity.setVideoName(createVideoRequest.getVideoName());
        videosEntity.setVideoLink(createVideoRequest.getVideoLink());
        return videosEntity;
    }
}
