package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
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
}
