package com.example.backend.service;

import com.example.backend.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TaskInterface {
    List<Task> getTasks();
    Task create(Task task);
    Task findById(Long id);
    Task update(Task task);
    void delete(Long id);
}
