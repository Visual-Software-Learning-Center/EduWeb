package com.eduweb.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CreateAssignmentRequest {

    private String title;
    private String descriptions;
    private Date dueDate;
}
