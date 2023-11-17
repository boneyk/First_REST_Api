package com.example.backend.service;

import com.example.backend.model.Task;
import com.example.backend.repository.TaskDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService implements TaskInterface{

    private final TaskDTO repository;
    @Override
    public List<Task> getTasks() {
        return repository.getTasks();
    }

    @Override
    public Task create(Task task) {
        return repository.create(task);
    }

    @Override
    public Task findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Task update(Task task) {
        return repository.update(task);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
