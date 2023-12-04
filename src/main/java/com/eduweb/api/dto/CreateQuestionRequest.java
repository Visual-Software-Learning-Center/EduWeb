package com.eduweb.api.dto;

import lombok.Data;

@Data
public class CreateQuestionRequest {
    private String questionName;
    private String descriptions;
}
