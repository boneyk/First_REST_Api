package com.example.backend.DTO;

import com.example.backend.model.Task;
import lombok.Data;

@Data
public class TaskWithOutDesc {
    private Long id;
    private String title;

    public static TaskWithOutDesc toModel(Task entity) {
        TaskWithOutDesc task = new TaskWithOutDesc();
        task.setId(entity.getId());
        task.setTitle(entity.getTitle());
        return task;
    }

    public TaskWithOutDesc() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
