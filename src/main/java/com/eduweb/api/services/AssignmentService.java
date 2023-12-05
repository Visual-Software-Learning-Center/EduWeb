package com.eduweb.api.services;

import com.eduweb.api.dto.AssignmentDto;
import com.eduweb.api.dto.CreateAssignmentRequest;
import com.eduweb.api.mapper.AssignmentMapper;
import com.eduweb.api.models.AssignmentsEntity;
import com.eduweb.api.repository.AssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentService {
    AssignmentRepository assignmentRepository;

    AssignmentMapper assignmentMapper;

    // cutomized method should implements Repo
    public List<AssignmentDto>  getAllAssignments(){
        List<AssignmentsEntity> assignmentEntities = assignmentRepository.findAll();
        List<AssignmentDto> assignmentsDtos = new ArrayList<>();
        for  (AssignmentsEntity assignmentsEntity: assignmentEntities){
            assignmentsDtos.add(assignmentMapper.mapEntityToDto(assignmentsEntity));
        }
        return assignmentsDtos;
    }

    // since get all, we need to map each element from entity to dto
    public List<AssignmentDto> getAssignmentsByTitle(String title){
        List<AssignmentsEntity> assignmentEntities = assignmentRepository.findAllByTitle(title);
        List<AssignmentDto> assignmentsDtos = new ArrayList<>();
        for  (AssignmentsEntity assignmentsEntity: assignmentEntities){
            assignmentsDtos.add(assignmentMapper.mapEntityToDto(assignmentsEntity));
        }
        return assignmentsDtos;
    }

    // for create/get 1 element, no need to loop and map

    public void createAssignment(CreateAssignmentRequest createAssignmentRequest){
        assignmentRepository.save(assignmentMapper.mapCreateAssignmentRequestToEntity(createAssignmentRequest));
    }

}
