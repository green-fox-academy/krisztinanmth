package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

  ToDoRepository toDoRepository;

  public ToDoServiceImpl(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @Override
  public List<ToDo> getToDos() {
    return toDoRepository.findAll();
  }

  @Override
  public ToDo getOneToDo(long id) {
    return toDoRepository.findById(id).get();
  }

  @Override
  public List<ToDo> findByDone(boolean done) {
    return toDoRepository.findByDone(done);
  }


  @Override
  public void deleteTodo(Long id) {
    toDoRepository.deleteById(id);
  }

  @Override
  public void saveToDo(ToDo toDo) {
    toDoRepository.save(toDo);
  }

  @Override
  public List<ToDo> searchForToDos(String word) {
    List<ToDo> searchedToDos = new ArrayList<>();
    for (int i = 0; i < toDoRepository.count() ; i++) {
      if (toDoRepository.findAll().get(i).getTitle().toLowerCase().contains(word.toLowerCase())) {
        searchedToDos.add(toDoRepository.findAll().get(i));
        }
      }
    return searchedToDos;
  }


}
