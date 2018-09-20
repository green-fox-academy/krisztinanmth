package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TrickList {

  private List<String> trickList;

  public TrickList() {
    trickList = Arrays.asList("sleeping", "flying", "dancing", "jumping high", "turning invisible");
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }
}
