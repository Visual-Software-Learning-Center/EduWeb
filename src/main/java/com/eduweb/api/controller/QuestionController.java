package com.eduweb.api.controller;

import com.eduweb.api.dto.QuestionDto;
import com.eduweb.api.dto.CreateQuestionRequest;
import com.eduweb.api.repository.QuestionRepository;
import com.eduweb.api.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class QuestionController {
    QuestionRepository questionRepository;
    QuestionService questionService;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("questions")
    public ResponseEntity<List<QuestionDto>> getQuestions(){
        try{
            return ResponseEntity.ok(questionService.getAllQuestions());
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("question")
    public ResponseEntity<List<QuestionDto>> getQuestionsByTitle(@PathVariable String title){
        try{
            return ResponseEntity.ok(questionService.getQuestionsByTitle(title));
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("questions")
    public ResponseEntity<HttpStatus> createQuestions(@RequestBody CreateQuestionRequest createQuestionRequest){
        try {
            questionService.createQuestion(createQuestionRequest);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
