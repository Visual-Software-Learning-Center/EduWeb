package com.eduweb.api.controller;

import com.eduweb.api.dto.CourseDto;
import com.eduweb.api.dto.CreateCourseRequest;
import com.eduweb.api.repository.CourseRepository;
import com.eduweb.api.services.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class CourseController {

    CourseRepository courseRepository;
    CourseService courseService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("courses")
    public ResponseEntity<List<CourseDto>> getCourses(){
        try{
            return ResponseEntity.ok(courseService.getAllCourses());
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("course")
    public ResponseEntity<List<CourseDto>> getCoursesByTitle(@PathVariable String courseName){
        try{
            return ResponseEntity.ok(courseService.getCoursesByCourseName(courseName));
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("courses")
    public ResponseEntity<HttpStatus> createCourses(@RequestBody CreateCourseRequest createCourseRequest){
        try {
            courseService.createCourse(createCourseRequest);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
