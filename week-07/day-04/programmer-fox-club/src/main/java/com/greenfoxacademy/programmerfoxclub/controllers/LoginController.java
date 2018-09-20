package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  private FoxService foxService;

  public LoginController() {
  }

  public LoginController(FoxService foxService) {
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


  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @GetMapping("")
  public String login(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null || name == "") {
      return "redirect:/login";
    }
    foxService.addNewFoxToList(name);
    model.addAttribute("name", name);
    model.addAttribute("fox", foxService.getFox(name));
    return "index";
  }
}
