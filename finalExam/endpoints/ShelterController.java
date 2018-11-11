package com.greenfoxacademy.shelterapp.controllers;

import com.greenfoxacademy.shelterapp.models.Shelter;
import com.greenfoxacademy.shelterapp.services.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class ShelterController {

  ShelterService shelterService;

  @Autowired
  public ShelterController(ShelterService shelterService) {
    this.shelterService = shelterService;
  }

  @GetMapping("")
  public String showSheltersPage(Model model) {
    List<Shelter> shelters = shelterService.getShelters();
    model.addAttribute("shelters", shelters);
    return "shelters";
  }

  @PostMapping("/shelters")
  public String createShelter(@ModelAttribute(value = "shelter-name") String shelterName) {
    shelterService.createShelter(shelterName);
    return "redirect:";
  }

  @GetMapping("/shelters/{id}")
  public String showShelterPage(@PathVariable(value = "id") Long id, Model model) {
    Shelter shelter = shelterService.getShelterById(id);
    model.addAttribute("shelter", shelter);
    return "shelter-pofile";
  }
}
