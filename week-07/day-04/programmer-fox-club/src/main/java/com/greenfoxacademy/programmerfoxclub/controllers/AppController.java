package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Trick;
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

//  @GetMapping("/")
//  public String getIndex(@RequestParam(value="name", required = false) String name, Model model) {
//    if (name == null) {
//      return "redirect:/login";
//    }
//    model.addAttribute("name", name);
//    return "index";
//  }
//
//  @GetMapping("/login")
//  public String getLogin() {
//    return "login";
//  }
//
//  @PostMapping("/login")
//  public String createNameOfPet(@RequestParam("name") String name, Model model) {
//    if (name == null || name == "") {
//      return "redirect:/login";
//    }
//    foxService.addNewFoxToList(name);
////    model.addAttribute("name", name);
//    model.addAttribute("fox",foxService.getFox(name));
//    return "redirect:/?name=" + name;
////    return "index";
//  }


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
  public String postNameFromLogin(@ModelAttribute(value = "name") String name) {
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

  @PostMapping("/nutritionstore")
  public String postNutritionsForFox(@RequestParam("name") String name, @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink) {
    foxService.GetFoxFromList(name).setFood(food);
    foxService.GetFoxFromList(name).setDrink(drink);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/eat")
  public String showEatPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.equals("")) {
      return "redirect:/login";
    }
    else {
      if (foxService.isFoxInList(name)) {
        model.addAttribute("fox", foxService.GetFoxFromList(name));
        return "eat";
      }
        return "redirect:/login";
    }
  }

  @GetMapping("/drink")
  public String showDrinkPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.equals("")) {
      return "redirect:/login";
    }
    else {
      if (foxService.isFoxInList(name)) {
        model.addAttribute("fox", foxService.GetFoxFromList(name));
        return "drink";
      }
        return "redirect:/login";
    }
  }

  @GetMapping("/trickcenter")
  public String showTrickCenter(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.equals("")) {
      return "redirect:/login";
    } else {
      if (foxService.isFoxInList(name)) {
        model.addAttribute("fox", foxService.GetFoxFromList(name));
        return "trickcenter";
      }
        return "redirect:/login";
    }
  }

  @PostMapping("/trickcenter")
  public String postTricksForFox(@RequestParam(value = "name") String name, @ModelAttribute(value = "trick") String trick) {
    foxService.GetFoxFromList(name).getTricks().add(new Trick(trick));
    return "redirect:/?name=" + name;
  }

  @GetMapping("/tricks")
  public String showTrickPage(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name.equals("")) {
      return "redirect:/login";
    }
    else {
      if (foxService.isFoxInList(name)) {
        model.addAttribute("fox", foxService.GetFoxFromList(name));
        return "tricks";
      }
        return "redirect:/login";
    }
  }
}
