package com.eduweb.api.models;

import jakarta.persistence.*;
import lombok.*;

@Data // generate all getter and setter automatically
@Builder
@Entity
@Table(name="Users")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String preferred_name;
    private String email;
    private String password;
    private Boolean isTutor;
    private Boolean isStudent;


}
