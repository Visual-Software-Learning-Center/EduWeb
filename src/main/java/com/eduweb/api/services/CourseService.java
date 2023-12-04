package com.eduweb.api.services;
import com.eduweb.api.dto.CreateCourseRequest;
import com.eduweb.api.mapper.CourseMapper;
import com.eduweb.api.dto.CourseDto;
import com.eduweb.api.models.CoursesEntity;
import com.eduweb.api.repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    CourseRepository courseRepository;
    CourseMapper courseMapper;
    
    public List<CourseDto> getAllCourses(){
        List<CoursesEntity> coursesEntities = courseRepository.findAll();
        List<CourseDto> courseDtos = new ArrayList<>();
        for(CoursesEntity coursesEntity:coursesEntities){
            courseDtos.add(courseMapper.mapEntityToDto(coursesEntity));
        }
        return courseDtos;
    }

    public List<CourseDto> getCoursesByCourseName(String courseName){
        List<CoursesEntity> coursesEntities = courseRepository.findAllByCourseName(courseName);
        List<CourseDto> courseDtos = new ArrayList<>();
        for(CoursesEntity coursesEntity:coursesEntities){
            courseDtos.add(courseMapper.mapEntityToDto(coursesEntity));
        }
        return courseDtos;
    }

    public void createCourse(CreateCourseRequest createCourseRequest){
        courseRepository.save(courseMapper.mapCreateCourseRequestToEntity(createCourseRequest));
    }
}
