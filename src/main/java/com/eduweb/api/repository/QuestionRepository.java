package com.eduweb.api.repository;

import com.eduweb.api.models.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer>{
    List<QuestionEntity> findAllByQuestionName(String courseName);
}
