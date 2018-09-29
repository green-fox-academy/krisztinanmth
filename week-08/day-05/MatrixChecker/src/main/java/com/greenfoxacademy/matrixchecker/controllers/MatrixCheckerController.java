package com.greenfoxacademy.matrixchecker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatrixCheckerController {


  @GetMapping("/")
  public String showMain() {
    return "index";
  }
}
