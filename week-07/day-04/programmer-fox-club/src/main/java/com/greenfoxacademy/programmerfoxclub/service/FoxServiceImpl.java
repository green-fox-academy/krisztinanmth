package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.FoxList;
import org.springframework.beans.factory.annotation.Autowired;

public class FoxServiceImpl implements FoxService {

  FoxList allFoxes;

  @Autowired
  public FoxServiceImpl(FoxList allFoxes) {
    this.allFoxes = allFoxes;
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
}
