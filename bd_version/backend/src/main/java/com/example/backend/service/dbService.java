package com.example.backend.service;

import com.example.backend.DTO.TaskWithOutDesc;
import com.example.backend.model.Task;
import com.example.backend.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class dbService implements TaskInterface {
    private final TaskRepository repository;
    @Override
    public List<Task> getTasks() {
        return repository.findAll();
    }

    private final ModelMapper modelMapper;

   @Override
    public Task create(Task task) {
        return repository.save(task);
    }

    @Override
    public TaskWithOutDesc findById(Long id) {
//        return TaskWithOutDesc.toModel(repository.findById(id));
        return modelMapper.map(repository.findById(id), TaskWithOutDesc.class);
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
