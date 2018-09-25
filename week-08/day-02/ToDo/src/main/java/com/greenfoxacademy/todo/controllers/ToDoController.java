package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

//  @ResponseBody - this was just necessary as we did not return an HTML file but a JSON file
  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    return "todolist";
  }
}
