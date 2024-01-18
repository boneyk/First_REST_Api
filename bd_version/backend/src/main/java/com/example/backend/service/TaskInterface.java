package com.example.backend.service;

import com.example.backend.DTO.TaskWithTitleAndDesc;
import com.example.backend.model.TaskEntity;

import java.util.List;


public interface TaskInterface {
    List<TaskEntity> getTasks();
    TaskEntity create(TaskEntity task);
    TaskWithTitleAndDesc findById(Long id);
    TaskEntity update(TaskEntity task);
    void delete(Long id);
}
