package com.greenfoxacademy.spacetravel.controllers;

import com.greenfoxacademy.spacetravel.models.Spaceship;
import com.greenfoxacademy.spacetravel.services.SpaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class SpaceController {

  private static final long shipId = 1L;
  private SpaceService spaceService;

  public SpaceController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping()
  public String showMainPage(Model model) {
    model.addAttribute("planets", spaceService.getPlanets());
    model.addAttribute("ship", spaceService.getShip(shipId));
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveShipToPlanet(@PathVariable(value = "id") Long id) {
    spaceService.moveShipToPlanet(shipId, id);
    return "redirect:/";
  }

  @GetMapping("/toship/{id}")
  public String movePeopleToShip(@PathVariable(value = "id") Long planetId) {
    spaceService.movePeopleToShip(shipId, planetId);
    return "redirect:/";
  }
}







































