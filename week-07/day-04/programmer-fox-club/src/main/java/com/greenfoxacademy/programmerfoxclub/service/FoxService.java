package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxService {

  void addNewFoxToList(String name);
  Fox getFox(String name);
}
