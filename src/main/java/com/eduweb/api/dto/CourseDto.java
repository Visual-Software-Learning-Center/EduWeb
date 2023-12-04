package com.eduweb.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter// generate all getter and setter automatically
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    private String courseName;
    private String descriptions;
}

