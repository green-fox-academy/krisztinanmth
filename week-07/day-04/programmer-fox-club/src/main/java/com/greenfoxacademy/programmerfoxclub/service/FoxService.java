package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.List;

public interface FoxService {

//  void addNewFoxToList(String name);
//  Fox getFox(String name);
//  List<String> getDrinkList();
//  List<String> getFoodList();
//  List<String> getTrickList();
//  void addNewFood(String food, String drink, String name);
//  void setNewDrink(String drink, String name);
//  void setNewFood(String food, String name);
//  void addNewTrick(String trick, String name);

  void addNewFox(Fox fox);
  void addNewTrick(String trick);
  Fox findFox();

}
