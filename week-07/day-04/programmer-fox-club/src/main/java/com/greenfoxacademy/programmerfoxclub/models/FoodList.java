package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FoodList {

  private List<String> foodList;

  public FoodList() {
    foodList = Arrays.asList("pizza", "sushi", "pasta", "chocolate", "fruits");
  }

  public List<String> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<String> foodList) {
    this.foodList = foodList;
  }
}
