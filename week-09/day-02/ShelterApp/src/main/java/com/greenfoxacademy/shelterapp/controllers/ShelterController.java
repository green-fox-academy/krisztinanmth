package com.greenfoxacademy.shelterapp.controllers;

import com.greenfoxacademy.shelterapp.models.Shelter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShelterController {


  @GetMapping("")
  public String showSheltersPage(Model model) {
    Shelter shelter = new Shelter("happy shelter");
    List<Shelter> shelters = Arrays.asList(shelter);
    model.addAttribute("shelters", shelters);
    return "shelters";
  }
}
