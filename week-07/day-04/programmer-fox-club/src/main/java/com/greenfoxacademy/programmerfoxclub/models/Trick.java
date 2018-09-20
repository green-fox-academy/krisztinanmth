package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class Trick {

  private String nameOfTrick;

  public Trick() {
  }

  public Trick(String nameOfTrick) {
    this.nameOfTrick = nameOfTrick;
  }

  public String getNameOfTrick() {
    return nameOfTrick;
  }

  public void setNameOfTrick(String nameOfTrick) {
    this.nameOfTrick = nameOfTrick;
  }
}
