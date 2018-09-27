package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/todo")
public class ToDoController {

  private ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  //  @ResponseBody - this was just necessary as we did not return an HTML file but a JSON file
  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean done, Model model) {
    if (done == null) {
      model.addAttribute("todolist", toDoRepository.findAll());
    }
    else {
      model.addAttribute("todolist", toDoRepository.findByDone(done));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addToDo() {
    return "create-todo";
  }

  @PostMapping("/add")
  public String postToDo(@RequestParam(value = "title") String title) {
    toDoRepository.save(new ToDo(title));
    return "redirect:/todo/";
  }

  @PostMapping("/{id}/delete")
  public String deleteToDo(@PathVariable(value = "id") Long id) {
    toDoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String showEditPage(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("todo", toDoRepository.findById(id).get());
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String postToDoUpdates(@ModelAttribute(value = "todo") ToDo todo) {
    toDoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/search")
  public String showSearchedToDos(@ModelAttribute(value = "search") String word, Model model) {
    if (word == null) {
      model.addAttribute("todolist", toDoRepository.findAll());
    } else {
      List<ToDo> searchedToDos = new ArrayList<>();
      for (int i = 0; i < toDoRepository.count() ; i++) {
        if(toDoRepository.findAll().get(i).getTitle().toLowerCase().contains(word.toLowerCase())) {
          searchedToDos.add(toDoRepository.findAll().get(i));
        }
      }
      model.addAttribute("todolist", searchedToDos);
    }
    return "todolist";
  }
}
