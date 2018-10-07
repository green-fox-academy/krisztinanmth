package com.greenfoxacademy.spaceship.controllers;


import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.services.PlanetService;
import com.greenfoxacademy.spaceship.services.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class MainController {

  SpaceshipService spaceshipService;
  PlanetService planetService;

  @Autowired
  public MainController(SpaceshipService spaceshipService, PlanetService planetService) {
    this.spaceshipService = spaceshipService;
    this.planetService = planetService;
  }

  @GetMapping("/")
  public String showMain(Model model) {
    List<Planet> planets = planetService.getAllPlanets();
    model.addAttribute("planets", planets);
    model.addAttribute("spaceship", spaceshipService.findById(1L));
    return "main";
  }

  @PostMapping("/movehere/{id}")
  public String moveSpaceShip(@PathVariable(value = "id") Long id) {
    spaceshipService.moveShipToPlanet(id);
    return "redirect:/";
  }
}
