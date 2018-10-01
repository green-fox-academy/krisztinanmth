package com.greenfoxacademy.restbackend.models;

public class AppendThis {

  private String appended;

  public AppendThis() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appendable) {
    this.appended = appendable + "a";
  }
}
