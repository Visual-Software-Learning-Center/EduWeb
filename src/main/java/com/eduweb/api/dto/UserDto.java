package com.eduweb.api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter// generate all getter and setter automatically
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String username;
    private List<String> roles;
}
