package com.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;

}
