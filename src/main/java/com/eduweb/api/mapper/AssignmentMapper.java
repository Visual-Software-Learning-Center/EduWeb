package com.eduweb.api.mapper;

import com.eduweb.api.dto.AssignmentDto;
import com.eduweb.api.dto.CreateAssignmentRequest;
import com.eduweb.api.models.AssignmentsEntity;
import org.springframework.stereotype.Component;

@Component
public class AssignmentMapper {
    public AssignmentDto mapEntityToDto(AssignmentsEntity assignmentsEntity){
        AssignmentDto assignmentsDto = new AssignmentDto();
        assignmentsDto.setTitle(assignmentsEntity.getTitle());
        assignmentsDto.setDescriptions(assignmentsEntity.getDescriptions());
        assignmentsDto.setDueDate(assignmentsEntity.getDueDate());
        return assignmentsDto;
    }

    public AssignmentsEntity mapCreateAssignmentRequestToEntity(CreateAssignmentRequest createAssignmentRequest){
        AssignmentsEntity assignmentsEntity = new AssignmentsEntity();
        assignmentsEntity.setTitle(createAssignmentRequest.getTitle());
        assignmentsEntity.setDescriptions(createAssignmentRequest.getDescriptions());
        assignmentsEntity.setDueDate(createAssignmentRequest.getDueDate());
        return assignmentsEntity;
    }

}
