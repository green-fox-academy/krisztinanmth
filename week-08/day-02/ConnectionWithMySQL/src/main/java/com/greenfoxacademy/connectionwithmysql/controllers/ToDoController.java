package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.services.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class ToDoController {

  private ToDoService toDoService;

  public ToDoController(ToDoService toDoService) {
    this.toDoService = toDoService;
  }

// @ResponseBody - this was just necessary as we did not return an HTML file but a JSON file
  @GetMapping(value = {"/", "/list"})
  public String showMain(@RequestParam(value = "isActive", required = false)Boolean done, Model model) {
    if (done == null) {
      model.addAttribute("todolist", toDoService.getToDos());
    } else {
      model.addAttribute("todolist", toDoService.findByDone(done));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String ShowCreateNewTodo() {
    return "create-todo";
  }

  @PostMapping("/add")
  public String postNewToDo(@RequestParam(value = "title") String title) {
    toDoService.saveToDo(new ToDo(title));
    return "redirect:/todo/";
  }

  @PostMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value = "id") Long id) {
    toDoService.deleteTodo(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String showEdit(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("todo", toDoService.getOneToDo(id));
    return "edit-todo";
  }


  @PostMapping("/{id}/edit")
  public String postToDoEdits(@ModelAttribute ToDo toDo) {
    toDoService.saveToDo(toDo);
    return "redirect:/todo/";
  }


  @GetMapping("/search")
  public String showSearchedToDos(@RequestParam(value = "search") String word, Model model) {
    if (word == null) {
      model.addAttribute("todolist", toDoService.getToDos());
    } else {
      model.addAttribute("todolist", toDoService.searchForToDos(word));
    }
    return "todolist";
  }
}
