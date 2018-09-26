package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySQLApplication implements CommandLineRunner {

  ToDoRepository toDoRepository;

  @Autowired
  public ConnectionWithMySQLApplication(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMySQLApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    toDoRepository.save(new ToDo("learn ORM", false, true ));
//    toDoRepository.save(new ToDo("watch videos for tomorrow", false, true));
//    toDoRepository.save(new ToDo("practise for exam"));
//    toDoRepository.save(new ToDo("feed the cat", true, false));
//    toDoRepository.save(new ToDo("have some fun"));
  }
}