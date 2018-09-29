package com.greenfoxacademy.matrixchecker.controllers;

import com.greenfoxacademy.matrixchecker.services.MatrixService;
import org.springframework.stereotype.Controller;

@Controller
public class MatrixController {

  MatrixService matrixService;

  public MatrixController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }
}
