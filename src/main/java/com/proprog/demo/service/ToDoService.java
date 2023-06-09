package com.proprog.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proprog.demo.data.ToDo;
import com.proprog.demo.exception.EntityNotFoundException;
import com.proprog.demo.repository.ToDoRepository;

@Service
public class ToDoService {
    
    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    } 

    public ToDo findById(String id) {
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo todo) {
        return toDoRepository.save(todo);
    }

    public void deleteById(String id) {
        toDoRepository.deleteById(id);
    }

    public void deleteAll() {
        toDoRepository.deleteAll();
    }
    
}
