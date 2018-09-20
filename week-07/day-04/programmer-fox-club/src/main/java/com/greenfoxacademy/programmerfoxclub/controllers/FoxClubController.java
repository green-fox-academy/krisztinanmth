package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoxClubController {

  @GetMapping("/")
  public String getIndex() {
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }
}
