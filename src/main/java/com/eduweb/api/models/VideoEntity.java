package com.eduweb.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data // generate all getter and setter automatically
@Builder
@Entity
@Table(name="videos")
@NoArgsConstructor
@AllArgsConstructor
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String videoName;
    private String videoLink;
}