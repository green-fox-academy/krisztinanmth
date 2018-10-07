package com.greenfoxacademy.alopexorientationexampractise.controllers;

import com.greenfoxacademy.alopexorientationexampractise.models.Attraction;
import com.greenfoxacademy.alopexorientationexampractise.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    model.addAttribute("newAttraction", new Attraction());
    return "attractions";
  }

  @PostMapping("/add")
  public String addNewAttraction(@ModelAttribute Attraction newAttraction) {
    attractionService.creteNewAttraction(newAttraction);
    return "redirect:/";
  }
}
