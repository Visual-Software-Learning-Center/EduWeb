package com.eduweb.api.dto;

import lombok.Data;

import java.util.Date;

@Data

public class CreateCourseRequest {
    private String courseName;
    private String descriptions;
}
