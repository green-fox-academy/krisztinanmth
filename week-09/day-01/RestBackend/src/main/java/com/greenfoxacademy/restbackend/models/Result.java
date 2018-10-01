package com.greenfoxacademy.restbackend.models;

public class Result {

  private Object result;

  public Result() {
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "Result{" +
      "result=" + result +
      '}';
  }
}
