package com.greenfoxacademy.restbackend.models;

import javax.persistence.Entity;

@Entity
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

  @Override
  public String toString() {
    return "AppendThis{" +
      "appended='" + appended + '\'' +
      '}';
  }
}
