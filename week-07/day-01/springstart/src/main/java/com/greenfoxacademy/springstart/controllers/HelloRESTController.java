package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greetings;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {


  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public Greetings greeting(@RequestParam(value = "name") String name) {
    Greetings greeting = new Greetings(1, "hello " + name);
    return greeting;
  }

  /**
   * Open http://localhost:8080/greeting?name=Your%20name in your web browser
   * Your output should look like: {"id":1,"content":"Hello, Your name!"}
   */
}
