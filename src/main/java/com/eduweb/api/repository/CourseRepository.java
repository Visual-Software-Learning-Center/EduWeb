package com.eduweb.api.repository;

import com.eduweb.api.models.AssignmentsEntity;
import com.eduweb.api.models.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CoursesEntity,Integer> {
    List<CoursesEntity> findAllByCourseName(String courseName);
}
