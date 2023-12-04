package com.eduweb.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter// generate all getter and setter automatically
@NoArgsConstructor
@AllArgsConstructor
public class VideoDto {
    private String videoName;
    private String videoLink;
}
