package com.greenfoxacademy.restbackend.models;

import javax.persistence.Entity;

@Entity
public class DoUntil {

  private Integer until;

  public DoUntil() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  @Override
  public String toString() {
    return "DoUntil{" +
      "until=" + until +
      '}';
  }
}
