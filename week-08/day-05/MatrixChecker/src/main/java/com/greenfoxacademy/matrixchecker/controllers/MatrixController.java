package com.greenfoxacademy.matrixchecker.controllers;

import com.greenfoxacademy.matrixchecker.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MatrixController {

  MatrixService matrixService;

  @Autowired
  public MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String showIndex(@ModelAttribute("message") String message, Model model) {
    model.addAttribute("inputNumbers", "");
    model.addAttribute(message);
    return "index";
  }

  @PostMapping("/matrix")
  public String postMatrix(@ModelAttribute("inputNumbers") String inputNumbers, RedirectAttributes redirectAttributes) {
    String message = matrixService.printMessages(inputNumbers);
    redirectAttributes.addFlashAttribute("message", message);
    return "redirect:/";
  }
}
