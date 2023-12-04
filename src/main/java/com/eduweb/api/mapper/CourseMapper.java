package com.eduweb.api.mapper;

import com.eduweb.api.dto.CourseDto;
import com.eduweb.api.dto.CreateCourseRequest;
import com.eduweb.api.models.CoursesEntity;
import com.eduweb.api.models.CoursesEntity;

public class CourseMapper {
    public CourseDto mapEntityToDto(CoursesEntity courseEntity){
        CourseDto courseDto= new CourseDto();
        courseDto.setCourseName(courseEntity.getCourseName());
        courseDto.setDescriptions(courseEntity.getDescriptions());
        return courseDto;
    }
    
    public CoursesEntity mapCreateCourseRequestToEntity(CreateCourseRequest createCourseRequest){
        CoursesEntity coursesEntity = new CoursesEntity();
        coursesEntity.setCourseName(createCourseRequest.getCourseName());
        coursesEntity.setDescriptions(createCourseRequest.getDescriptions());
        return coursesEntity;
    }
}
