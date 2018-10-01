package com.greenfoxacademy.restbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

  @GetMapping("/")
  public String showMain() {
    return "index";
  }
}
