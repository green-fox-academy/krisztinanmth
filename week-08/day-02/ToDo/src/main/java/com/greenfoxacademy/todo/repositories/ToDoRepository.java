package com.greenfoxacademy.todo.repositories;

import com.greenfoxacademy.todo.models.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
