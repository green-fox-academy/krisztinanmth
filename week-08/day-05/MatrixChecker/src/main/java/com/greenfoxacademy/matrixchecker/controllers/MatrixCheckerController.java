package com.greenfoxacademy.matrixchecker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatrixCheckerController {


  @GetMapping("/")
  public String showMain() {
    return "index";
  }

  @PostMapping("/matrix")
  public String postMatrix() {
    return "redirect:/index";
  }
}


