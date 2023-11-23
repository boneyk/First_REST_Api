package com.example.backend.DTO;

import com.example.backend.model.Task;
import lombok.Data;

@Data
public class WithOutDesc {
    private Long id;
    private String title;

    public static WithOutDesc toModel(Task entity) {
        WithOutDesc task = new WithOutDesc();
        task.setId(entity.getId());
        task.setTitle(entity.getTitle());
        return task;
    }

    public WithOutDesc() {

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
