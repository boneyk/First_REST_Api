package com.example.backend.controller;

import com.example.backend.exceptions.TaskAlreadyExistException;
import com.example.backend.exceptions.TaskNotFoundException;
import com.example.backend.model.Task;
import com.example.backend.service.TaskInterface;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity create(@RequestBody Task task){
        try{
            if(taskservice.findById(task.getId()) == null){
                taskservice.create(task);
                return  ResponseEntity.ok("Задача успешно сохранена");
            }else{
                throw new TaskAlreadyExistException("Task already exist with id: " + task.getId());
            }
        }catch (TaskAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        try {
            if (taskservice.findById(id) != null){
                return ResponseEntity.ok(taskservice.findById(id));
            }else{
                throw new TaskNotFoundException("Task not found with id: " + id);
            }
        } catch (TaskNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Task task){
        try {
            return ResponseEntity.ok(taskservice.update(task));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        try {
            if(taskservice.findById(id) != null) {
                taskservice.delete(id);
                return ResponseEntity.ok("Задача успешно удалена");
            }else{
                throw new TaskNotFoundException("Task not found with id: " + id);
            }
        } catch (TaskNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
