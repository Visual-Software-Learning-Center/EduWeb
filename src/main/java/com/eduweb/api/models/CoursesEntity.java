package com.eduweb.api.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data // generate all getter and setter automatically
@Builder
@Entity
@Table(name="Courses")
@NoArgsConstructor
@AllArgsConstructor
public class CoursesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String courseName;
    private String descriptions;
}