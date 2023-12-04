package com.eduweb.api.controller;

import com.eduweb.api.dto.AssignmentDto;
import com.eduweb.api.dto.CreateAssignmentRequest;
import com.eduweb.api.repository.AssignmentRepository;
import com.eduweb.api.services.AssignmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class AssignmentController {

    AssignmentRepository assignmentRepository;
    AssignmentService assignmentService;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("assignments")
    public ResponseEntity<List<AssignmentDto>> getAssignments(){
        try{
            return ResponseEntity.ok(assignmentService.getAllAssignments());
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("assignment")
    public ResponseEntity<List<AssignmentDto>> getAssignmentsByTitle(@PathVariable String title){
        try{
            return ResponseEntity.ok(assignmentService.getAssignmentsByTitle(title));
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("assignments")
    public ResponseEntity<HttpStatus> createAssignments(@RequestBody CreateAssignmentRequest createAssignmentRequest){
        try {
            assignmentService.createAssignment(createAssignmentRequest);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
