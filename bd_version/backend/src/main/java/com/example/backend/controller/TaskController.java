package com.example.backend.controller;

import com.example.backend.model.Task;
import com.example.backend.service.TaskInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskInterface taskservice;

    @GetMapping()
    public List<Task> getTasks() {
        return taskservice.getTasks();
    }

    @PostMapping("/create_task")
    public Task create(@RequestBody Task task){
        return taskservice.create(task);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        return taskservice.findById(id);
    }

    @PutMapping("/update")
    public Task update(@RequestBody Task task){
        return taskservice.update(task);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Long id){
        taskservice.delete(id);
    }
}
