package com.eduweb.api.services;

import com.eduweb.api.dto.QuestionDto;
import com.eduweb.api.dto.CreateQuestionRequest;
import com.eduweb.api.mapper.QuestionMapper;
import com.eduweb.api.models.QuestionEntity;
import com.eduweb.api.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    QuestionRepository questionRepository;

    QuestionMapper questionMapper;

    public List<QuestionDto> getAllQuestions(){
        List<QuestionEntity> questionEntities = questionRepository.findAll();
        List<QuestionDto> questionsDtos = new ArrayList<>();
        for  (QuestionEntity questionsEntity: questionEntities){
            questionsDtos.add(questionMapper.mapEntityToDto(questionsEntity));
        }
        return questionsDtos;
    }

    // since get all, we need to map each element from entity to dto
    public List<QuestionDto> getQuestionsByTitle(String title){
        List<QuestionEntity> questionEntities = questionRepository.findAllByQuestionName(title);
        List<QuestionDto> questionsDtos = new ArrayList<>();
        for  (QuestionEntity questionsEntity: questionEntities){
            questionsDtos.add(questionMapper.mapEntityToDto(questionsEntity));
        }
        return questionsDtos;
    }

    // for create/get 1 element, no need to loop and map

    public void createQuestion(CreateQuestionRequest createQuestionRequest){
        questionRepository.save(questionMapper.mapCreateQuestionRequestToEntity(createQuestionRequest));
    }
}
