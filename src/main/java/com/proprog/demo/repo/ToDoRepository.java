package com.proprog.demo.repo;

import com.proprog.demo.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<Todo, String> {

}
