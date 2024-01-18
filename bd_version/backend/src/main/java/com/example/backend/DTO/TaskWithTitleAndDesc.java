package com.example.backend.DTO;

import lombok.Data;

@Data
public class TaskWithTitleAndDesc {
    private String title;
    private String description;

    public TaskWithTitleAndDesc() {

    }
}
