package com.greenfoxacademy.restbackend.models;

import java.util.List;

public class ArrayHandler {

  private String what;
  private List<Integer> numbers;

  public ArrayHandler() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  @Override
  public String toString() {
    return "ArrayHandler{" +
      "what='" + what + '\'' +
      ", numbers=" + numbers +
      '}';
  }
}
