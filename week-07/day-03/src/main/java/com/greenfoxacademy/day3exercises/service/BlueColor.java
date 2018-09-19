package com.greenfoxacademy.day3exercises.service;

import org.springframework.stereotype.Service;

public class BlueColor implements MyColor {

  @Override
  public String printColor() {
    return "this line is blue...use your imagination";
  }
}
