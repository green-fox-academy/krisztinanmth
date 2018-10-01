package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import com.greenfoxacademy.restbackend.models.WelcomeMessage;
import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  RestService restService;

  @Autowired
  public MainRestController(RestService restService) {
    this.restService = restService;
  }

  @GetMapping("/doubling")
  public Object doubleInput(@RequestParam(value = "input", required = false) Integer numberToDouble) {
    if (numberToDouble == null) {
      ErrorMessage error = new ErrorMessage();
      error.setError("Please provide an input!");
      return error;
    }
    Doubling doubling = restService.doubleTheInput(numberToDouble);
    return doubling;
  }

  @GetMapping("/greeter")
  public Object greetThePerson(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    ErrorMessage error = new ErrorMessage();
    if (name == null) { //itt nem lehet equals csak == mert meg nincs letrehozva
      error.setError("Please provide a name!");
      return error;
    }
    if (title == null) {
      error.setError("Please provide a title!");
      return error;
    }
    WelcomeMessage welcomeMessage = new WelcomeMessage();
    welcomeMessage.setWelcome_message(name, title);
    return welcomeMessage;
  }
}
