package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    if (title == null) { //itt nem lehet equals csak == mert meg nincs letrehozva
      error.setError("Please provide a title!");
      return error;
    }
    WelcomeMessage welcomeMessage = new WelcomeMessage();
    welcomeMessage.setWelcome_message(name, title);
    return welcomeMessage;
  }

  @GetMapping("/appenda/{appendable}")
  public Object showAppended(@PathVariable(value = "appendable") String appendable) {
    AppendThis appendThis = new AppendThis();
    appendThis.setAppended(appendable);
    return appendThis;
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) DoUntil dountil) {
    Result result = new Result();
    if (dountil == null) {
      ErrorMessage errorMessage = new ErrorMessage();
      errorMessage.setError("Please provide a number!");
      return errorMessage;
    }
    if (action.equals("sum")) {
      result = restService.sumDoUntil(dountil.getUntil());
    }
    if (action.equals("factor")) {
      result = restService.factorDoUntil(dountil.getUntil());
    }
    return result;
  }

  @PostMapping("/arrays")
  public Object handleArray(@RequestBody(required = false) ArrayHandler arrayHandler) {
    Result result = new Result();
    ErrorMessage errorMessage = new ErrorMessage();
    if (arrayHandler.getNumbers() == null) {
      errorMessage.setError("Please provide the numbers!");
      return errorMessage;
    }
    if (arrayHandler.getWhat() == null) {
      errorMessage.setError("Please provide what to do with the numbers!");
      return errorMessage;
    }
    if (arrayHandler.getWhat().equals("sum")) {
      result = restService.sumNumbers(arrayHandler.getNumbers());
    }
    if (arrayHandler.getWhat().equals("multiply")) {
      result = restService.multiplyNumbers(arrayHandler.getNumbers());
    }
    if (arrayHandler.getWhat().equals("double")) {
      result = restService.doubleNumbersInList(arrayHandler.getNumbers());
    }
    return result;
  }
}
