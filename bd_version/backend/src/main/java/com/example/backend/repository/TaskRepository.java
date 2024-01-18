package com.example.backend.repository;


import com.example.backend.model.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskEntity,Long> {

}
