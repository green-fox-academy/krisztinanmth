package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.service.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

// SZEDD SZET CONTROLLERT, AHANY HTML PAGE, ANNYI CONTROLLER LEGYEN

public class AppController {

  private FoxServiceImpl foxService;

  public AppController() {
  }

  @Autowired
  public AppController(FoxServiceImpl foxService) {
    this.foxService = foxService;
  }


  @GetMapping("/")
  public String showIndexPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.equals("")) {
      return "redirect:/login";
    }
    else {
      if (foxService.isFoxInList(name)) {
        model.addAttribute("fox", foxService.GetFoxFromList(name));
        return "index";
      }
        return "redirect:/login";
    }
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String postNameFromLogin(@RequestParam(value = "name") String name) {
    foxService.addNewFoxToList(name);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionstore")
  public String showNutritionPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.equals("")) {
      return "redirect:/login";
    }
    else {
      if (foxService.isFoxInList(name)) {
        model.addAttribute("fox", foxService.GetFoxFromList(name));
        return "nutritionstore";
      }
      return "redirect:/login";
    }
  }

  @PostMapping("/nutrition")
  public String postDrinkAndFood(@RequestParam(value="name") String name, @RequestParam(value="food") String food, @RequestParam(value="drink") String drink) {
    foxService.GetFoxFromList(name).setDrink(drink);
    foxService.GetFoxFromList(name).setFood(food);
    return "redirect:/?name=" + name;

  }
}
