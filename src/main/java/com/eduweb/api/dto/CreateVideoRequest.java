package com.eduweb.api.dto;

import lombok.Data;

@Data
public class CreateVideoRequest {
    private String videoName;
    private String videoLink;
}
