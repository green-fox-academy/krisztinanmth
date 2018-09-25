package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.ToDo;
import com.greenfoxacademy.todo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  ToDoRepository toDoRepository;

  @Autowired
  public TodoApplication(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("learn ORM"));
    toDoRepository.save(new ToDo("feed the cat"));
    toDoRepository.save(new ToDo("have some fun"));
  }
}
