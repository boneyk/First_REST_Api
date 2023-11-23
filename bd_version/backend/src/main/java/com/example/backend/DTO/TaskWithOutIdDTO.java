package com.example.backend.DTO;

import com.example.backend.model.Task;
import lombok.Data;

@Data
public class TaskWithOutIdDTO {
    private String title;
    private String description;

    public static TaskWithOutIdDTO toModel( Task entity){
        TaskWithOutIdDTO task = new TaskWithOutIdDTO();
        task.setTitle(entity.getTitle());
        task.setDescription(entity.getDescription());
        return task;
    }

    public TaskWithOutIdDTO(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
