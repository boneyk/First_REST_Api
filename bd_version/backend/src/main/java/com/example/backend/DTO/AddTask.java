package com.example.backend.DTO;

import lombok.Data;

@Data
public class AddTask {
    private String title;
    private String description;
    private boolean status;
    private String date;
}
