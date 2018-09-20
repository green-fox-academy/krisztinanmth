package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxClubController {

  @GetMapping("/")
  public String getIndex(@RequestParam(value="name") String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String createNameOfPet(@RequestParam(value="name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    return "redirect:/?name=" + name;
  }
}
