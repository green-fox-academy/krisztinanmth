package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.HelloAllWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;

@Controller
public class HelloAllWorldController {

  @GetMapping("/helloallworld")
  public String greetTheWorld(Model model, @RequestParam("name") String name) {
    HelloAllWorld helloAllWorld = new HelloAllWorld();
    model.addAttribute("helloallworld", helloAllWorld.getHelloAllWorld());
    return "helloallworld";
  }

//  @GetMapping("/helloallworld")
//  public String greetTheWorld(Model model, @RequestParam("name") String name) {
//    Random random = new Random();
//    int randomColor = random.nextInt(256);
//    HelloAllWorld randomHello = new HelloAllWorld();
//    model.addAttribute("name", name);
//    model.addAttribute("helloallworld", randomHello.printRandomHello());
//    model.addAttribute("color", randomColor + ", " + randomColor + ", " + randomColor);
//    return "helloallworld";
//  }
}
