package com.eduweb.api.dto;


import lombok.Data;

@Data
public class CreateUserRequest {
    private String username;
    private String preferred_name;
    private String email;
    private String password;
    private Boolean isTutor;
    private Boolean isStudent;
}

