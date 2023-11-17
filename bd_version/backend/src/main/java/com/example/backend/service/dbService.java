package com.example.backend.service;

import com.example.backend.model.Task;
import com.example.backend.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class dbService implements TaskInterface {
    private final TaskRepository repository;
    @Override
    public List<Task> getTasks() {
        return repository.findAll();
    }

    @Override
    public Task create(Task task) {
        return repository.save(task);
    }

    @Override
    public Task findById(Long id) {
        return repository.findTaskById(id);
    }

    @Override
    public Task update(Task task) {
        return repository.save(task);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
