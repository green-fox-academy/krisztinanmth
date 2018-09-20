package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxService {

  void addNewFoxToList(String name);
  Fox GetFoxFromList(String name);   // EZ ANIMAL KELL HOGY LEGYEN REFACTORALNI!!!!
  boolean isFoxInList(String name);      // MINDEN AMI FOX ANIMAL KELL H LEGYEN AKKOR
}
