package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {

  FoxList allFoxes;
  DrinkList drinkList;
  FoodList foodList;
  TrickList trickList;

  @Autowired
  public FoxServiceImpl(FoxList allFoxes) {
    this.allFoxes = allFoxes;
    this.drinkList = drinkList;
    this.foodList = foodList;
    this.trickList = trickList;
  }

  @Override
  public void addNewFoxToList(String name) {
    if (allFoxes.getFoxFromList(name) == null) {
      allFoxes.getAllFoxes().add(new Fox(name));
    }
  }

  @Override
  public Fox getFox(String name) {
    return allFoxes.getFoxFromList(name);
  }

  @Override
  public List<String> getDrinkList() {
    return drinkList.getDrinkList();
  }

  @Override
  public List<String> getFoodList() {
    return foodList.getFoodList();
  }

  @Override
  public List<String> getTrickList() {
    return trickList.getTrickList();
  }

  @Override
  public void addNewFood(String food, String drink, String name) {

  }

  @Override
  public void setNewDrink(String drink, String name) {
    allFoxes.getFoxFromList(name).setDrink(drink);
  }

  @Override
  public void setNewFood(String food, String name) {
    allFoxes.getFoxFromList(name).setFood(food);
  }

  @Override
  public void addNewTrick(String trick, String name) {

  }
}
