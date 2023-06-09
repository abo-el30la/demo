package com.proprog.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proprog.demo.data.ToDo;

/*
 * This is the interface that will be used to interact with the database.
 * It extends MongoRepository which is a Spring Data interface for generic CRUD operations on a repository of a specific type.
 * The type is Todo and the id is a String.
 */
public interface ToDoRepository extends MongoRepository<ToDo, String> {

}
