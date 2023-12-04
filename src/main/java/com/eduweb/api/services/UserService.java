package com.eduweb.api.services;

import com.eduweb.api.dto.CreateUserRequest;
import com.eduweb.api.mapper.UserMapper;
import com.eduweb.api.models.UserDto;
import com.eduweb.api.models.UserEntity;
import com.eduweb.api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class UserService{

    UserRepository userRepository;

    UserMapper userMapper;

    public ResponseEntity<List<UserDto>> getAllUsers(){
        try {
            List<UserEntity> userEntities= userRepository.findAll();
            List<UserDto> userDtos = new ArrayList<>();
            for(UserEntity userEntity : userEntities){
                userDtos.add(userMapper.mapEntityToDto(userEntity));
            }
            return ResponseEntity.ok(userDtos);
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public UserDto getUserByUsername(String username){
        UserEntity userEntity = userRepository.findByUsername(username);
        return userMapper.mapEntityToDto(userEntity);
    }

    public void createUser(CreateUserRequest createUserRequest){
        userRepository.save(userMapper.mapCreateUserRequestToEntity(createUserRequest));
    }
}
