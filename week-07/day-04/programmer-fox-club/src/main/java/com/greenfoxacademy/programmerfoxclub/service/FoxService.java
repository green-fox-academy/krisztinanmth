package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxService {

  void addNewFoxToList(String name);
  Fox getFox(String name);
}
