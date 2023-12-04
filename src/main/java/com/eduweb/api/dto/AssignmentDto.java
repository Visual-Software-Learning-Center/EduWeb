package com.eduweb.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

// if Entity add more columns,dto may not change,dto is for aggregation, flexibility
@Getter
@Setter// generate all getter and setter automatically
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentDto {
    private String title;
    private String descriptions;
    private Date dueDate;
}
