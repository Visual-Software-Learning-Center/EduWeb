package com.eduweb.api.controller;

import com.eduweb.api.dto.CreateVideoRequest;
import com.eduweb.api.dto.VideoDto;
import com.eduweb.api.repository.VideoRepository;
import com.eduweb.api.services.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class VideoController {
    VideoRepository videoRepository;
    VideoService videoService;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("videos")
    public ResponseEntity<List<VideoDto>> getVideos(){
        try{
            return ResponseEntity.ok(videoService.getAllVideos());
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("video")
    public ResponseEntity<List<VideoDto>> getVideosByTitle(@PathVariable String title){
        try{
            return ResponseEntity.ok(videoService.getVideosByTitle(title));
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("videos")
    public ResponseEntity<HttpStatus> createVideos(@RequestBody CreateVideoRequest createVideoRequest){
        try {
            videoService.createVideo(createVideoRequest);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
