package com.eduweb.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generate all getter and setter automatically
@Builder
@Entity
@Table(name="Questions")
@NoArgsConstructor
@AllArgsConstructor
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String QuestionName;
    private String descriptions;
    private String answer;

}
