package com.greenfoxacademy.matrixchecker.controllers;

import com.greenfoxacademy.matrixchecker.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatrixController {

  MatrixService matrixService;

  @Autowired
  public MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String showIndex(Model model) {
    model.addAttribute("message", matrixService.getMessage());
    return "index";
  }

  @PostMapping("/matrix")
  public String postMatrix(@ModelAttribute("inputNumbers") String inputNumbers) {
    if (!matrixService.isMatrixEmpty(inputNumbers)) {
      String[] matrix = matrixService.createMatrix(inputNumbers);
      if (matrixService.isMatrixSquare(matrix)) {
        if (matrixService.isMatrixIncreasing(matrix)) {
          matrixService.saveMatrix(matrix);
        }
      }
    }
    return "redirect:/";
  }
}
