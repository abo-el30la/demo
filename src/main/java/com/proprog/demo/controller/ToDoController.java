package com.proprog.demo.controller;

import java.util.List;

import com.proprog.demo.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proprog.demo.data.ToDo;
import com.proprog.demo.service.ToDoService;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll() {
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id) {
        return toDoService.findById(id);
    }

    @PostMapping("/create")
    public ToDo create(@RequestBody ToDo toDo) {
        return toDoService.save(toDo);
    }

    @PutMapping("update/{id}")
    public ToDo update(@RequestBody ToDo toDo) {
        return toDoService.save(toDo);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id) {
        toDoService.deleteById(id);
    }

}
