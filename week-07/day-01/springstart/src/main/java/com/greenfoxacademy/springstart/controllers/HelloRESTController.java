package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


  @GetMapping("/greeting")
  public Greetings greeting() {
    Greetings greeting = new Greetings(1, "hello");
    return greeting;
  }
}
