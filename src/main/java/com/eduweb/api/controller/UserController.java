package com.eduweb.api.controller;

import com.eduweb.api.dto.CreateUserRequest;
import com.eduweb.api.models.UserDto;
import com.eduweb.api.repository.UserRepository;
import com.eduweb.api.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class UserController {

    UserRepository userRepository;

    UserService userService;

    //need to customized exception,update login status,may need validation on register

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("user")
    public ResponseEntity<List<UserDto>> getUsers(){
        return userService.getAllUsers();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("user/{username}")
    public ResponseEntity<UserDto> getUserByUserName(@PathVariable String username){
        try {
            return ResponseEntity.ok(userService.getUserByUsername(username));
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("user")
    public ResponseEntity<HttpStatus> createUser(@RequestBody CreateUserRequest createUserRequest){
        try {
            userService.createUser(createUserRequest);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
