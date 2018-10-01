package com.greenfoxacademy.restbackend.models;

import javax.persistence.Entity;

@Entity
public class Doubling {

  private Integer received;
  private Integer result;


  public Doubling() {
  }

  public Doubling(Integer received, Integer result) {
    this.received = received;
    this.result = result;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "Doubling{" +
      "received=" + received +
      ", result=" + result +
      '}';
  }
}
