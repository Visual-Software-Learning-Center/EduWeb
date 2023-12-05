package com.eduweb.api.mapper;

import com.eduweb.api.dto.QuestionDto;
import com.eduweb.api.dto.CreateQuestionRequest;
import com.eduweb.api.models.QuestionEntity;
import org.springframework.stereotype.Component;

@Component
public class QuestionMapper {
    public QuestionDto mapEntityToDto(QuestionEntity questionsEntity){
        QuestionDto questionsDto = new QuestionDto();
        questionsDto.setQuestionName(questionsEntity.getQuestionName());
        questionsDto.setDescriptions(questionsEntity.getDescriptions());

        return questionsDto;
    }

    public QuestionEntity mapCreateQuestionRequestToEntity(CreateQuestionRequest createQuestionRequest){
        QuestionEntity questionsEntity = new QuestionEntity();
        questionsEntity.setQuestionName(createQuestionRequest.getQuestionName());
        questionsEntity.setDescriptions(createQuestionRequest.getDescriptions());
        return questionsEntity;
    }

}
