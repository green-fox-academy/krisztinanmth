package com.greenfoxacademy.alopexorientationexampractise.controllers;

import com.greenfoxacademy.alopexorientationexampractise.models.Attractions;
import com.greenfoxacademy.alopexorientationexampractise.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AttractionsRestController {

  private AttractionService attractionService;

  @Autowired
  public AttractionsRestController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/budge")
  public Attractions findCheapestByCategory() {
    return attractionService.findCheapestAttractions();
  }
}
