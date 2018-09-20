package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FoxList {

  private List<Fox> allFoxes;


  public FoxList() {

  }
  public FoxList(Fox fox) {
    this.allFoxes = new ArrayList<>();
  }

  public Fox getFoxFromList(String name) {    //do this one with normal method too, without streams
    if (!allFoxes.isEmpty()) {
      return allFoxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
    }
    return null;
  }

  public List<Fox> getAllFoxes() {
    return allFoxes;
  }

  public void setAllFoxes(List<Fox> allFoxes) {
    this.allFoxes = allFoxes;
  }
}
