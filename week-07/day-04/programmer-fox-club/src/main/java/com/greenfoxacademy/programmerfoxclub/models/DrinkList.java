package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DrinkList {

  private List<String> drinkList;

  public DrinkList() {
    drinkList = Arrays.asList("water", "orange juice", "red bull", "coffee", "beer");
  }

  public List<String> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<String> drinkList) {
    this.drinkList = drinkList;
  }
}

