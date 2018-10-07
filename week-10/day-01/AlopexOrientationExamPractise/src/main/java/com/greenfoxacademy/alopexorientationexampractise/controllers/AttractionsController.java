package com.greenfoxacademy.alopexorientationexampractise.controllers;

import com.greenfoxacademy.alopexorientationexampractise.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttractionsController {

  private AttractionService attractionService;

  @Autowired
  public AttractionsController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/")
  public String showAttractionsPage(Model model) {
    model.addAttribute("attractions", attractionService.getAllAttractions());
    return "attractions";
  }
}
