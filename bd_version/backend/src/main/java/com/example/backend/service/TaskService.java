package com.example.backend.service;

import com.example.backend.DTO.TaskWithTitleAndDesc;
import com.example.backend.model.TaskEntity;
import com.example.backend.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
@RequiredArgsConstructor
public class TaskService implements TaskInterface {
    private final TaskRepository repository;
    @Override
    public List<TaskEntity> getTasks() {
        return (List<TaskEntity>) repository.findAll();
    }

    private final ModelMapper modelMapper;

   @Override
    public TaskEntity create(TaskEntity task) {
        return repository.save(task);
    }

    @Override
    public TaskWithTitleAndDesc findById(Long id) {
//        return TaskWithOutDesc.toModel(repository.findById(id));
        return modelMapper.map(repository.findById(id), TaskWithTitleAndDesc.class);
    }

    @Override
    public TaskEntity update(TaskEntity task) {
        return repository.save(task);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
