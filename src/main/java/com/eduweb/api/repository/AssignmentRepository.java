package com.eduweb.api.repository;

import com.eduweb.api.models.AssignmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<AssignmentsEntity,Integer> {
    List<AssignmentsEntity> findAllByTitle(String title);
}
