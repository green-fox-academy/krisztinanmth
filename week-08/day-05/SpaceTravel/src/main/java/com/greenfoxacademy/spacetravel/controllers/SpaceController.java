package com.greenfoxacademy.spacetravel.controllers;

import com.greenfoxacademy.spacetravel.models.Spaceship;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class SpaceController {

  @GetMapping()
  public String showMainPage(Model model) {
    model.addAttribute("planets", new ArrayList<>());
    model.addAttribute("ship", new Spaceship());
    return "index";
  }
}
