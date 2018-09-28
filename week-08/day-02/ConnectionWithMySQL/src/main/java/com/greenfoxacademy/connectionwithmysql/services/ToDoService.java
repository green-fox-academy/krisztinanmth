package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import java.util.List;

public interface ToDoService {

  List<ToDo> getToDos();
  ToDo getOneToDo(long id);
  List<ToDo> findByDone(boolean done);
  void deleteTodo(Long id);
  void saveToDo(ToDo toDo);
  List<ToDo> searchForToDos(String word);

}
