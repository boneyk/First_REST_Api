package com.example.backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private Long id;
    private String title;
    private String description;

}
