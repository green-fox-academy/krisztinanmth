package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greetings;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong id;

  public HelloRESTController() {
    id = new AtomicLong(1);
  }

  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public Greetings greeting(@RequestParam(value = "name") String name) {
    Greetings greeting = new Greetings(id.getAndIncrement(), "hello " + name);
    return greeting;
  }
}
