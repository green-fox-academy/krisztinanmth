package com.greenfoxacademy.spacetravel.controllers;

import com.greenfoxacademy.spacetravel.models.Spaceship;
import com.greenfoxacademy.spacetravel.services.SpaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class SpaceController {

  private SpaceService spaceService;

  public SpaceController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping()
  public String showMainPage(Model model) {
    model.addAttribute("planets", spaceService.getPlanets());
    model.addAttribute("ship", spaceService.getShip(1L));
    return "index";
  }
}

















