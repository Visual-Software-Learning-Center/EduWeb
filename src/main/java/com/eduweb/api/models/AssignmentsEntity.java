package com.eduweb.api.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data // generate all getter and setter automatically
@Builder
@Entity
@Table(name="Assignments")
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String descriptions;
    private Date   dueDate;

}