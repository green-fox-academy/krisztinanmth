package com.greenfoxacademy.day3exercises.service;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  @Override
  public String printColor() {
    return "\nthis line is green...use your imagination";
  }
}
