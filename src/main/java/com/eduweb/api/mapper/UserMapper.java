package com.eduweb.api.mapper;

import com.eduweb.api.dto.CreateUserRequest;
import com.eduweb.api.models.UserDto;
import com.eduweb.api.models.UserEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserMapper {
    public UserDto mapEntityToDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setUsername(userEntity.getUsername());
        List<String> roles = new ArrayList<>();
        if (userEntity.getIsStudent()){
            roles.add("Student");
        }
        if (userEntity.getIsTutor()){
            roles.add("Tutor");
        }
        userDto.setRoles(roles);
        return userDto;
    }
    
    public UserEntity mapCreateUserRequestToEntity(CreateUserRequest createUserRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(createUserRequest.getUsername());
        userEntity.setPassword(createUserRequest.getPassword());
        userEntity.setPreferred_name(createUserRequest.getPreferred_name());
        userEntity.setIsStudent(createUserRequest.getIsStudent());
        userEntity.setIsTutor(createUserRequest.getIsTutor());
        return userEntity;
    }
}
