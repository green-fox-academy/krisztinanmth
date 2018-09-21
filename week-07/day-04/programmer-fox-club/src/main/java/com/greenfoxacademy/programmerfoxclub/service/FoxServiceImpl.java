package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.models.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {

  private List<Fox> allFoxes;

  public FoxServiceImpl() {
    allFoxes = new ArrayList<>();
  }

  @Override
  public void addNewFoxToList(String name) {
    Fox fox = new Fox(name);
    allFoxes.add(fox);
  }

  @Override
  public Fox GetFoxFromList(String name) {
    int indexOfFox = 0;
    for (int i = 0; i < allFoxes.size() ; i++) {
      if (name.equals(allFoxes.get(i).getName())) {
        indexOfFox = i;
      }
    }
    return allFoxes.get(indexOfFox);
  }

  @Override
  public boolean isFoxInList(String name) {
    for (Fox fox : allFoxes) {
      if (name.equals(fox.getName())) {
        return true;
      }
    }
    return false;
  }

  public List<Fox> getAllFoxes() {
    return allFoxes;
  }

  public void setAllFoxes(List<Fox> allFoxes) {
    this.allFoxes = allFoxes;
  }
}
