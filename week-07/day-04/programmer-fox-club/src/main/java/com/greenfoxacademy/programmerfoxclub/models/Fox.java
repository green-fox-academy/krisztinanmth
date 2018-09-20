package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
  List<String> tricks;

  public Fox(String name) {
    this.name = name;
  }

  public Fox(String name, String food, String drink, List<String> tricks) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    tricks = new ArrayList<>();
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public List<String> getTricks() {
    return tricks;
  }
}


