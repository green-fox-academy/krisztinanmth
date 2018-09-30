package com.greenfoxacademy.spacetravel.models;

import javax.persistence.*;

@Entity
public class Spaceship {

  @Id
  @GeneratedValue
  private Long id;
  @Column(name = "max_capacity")
  private int capacity;
  private String planet;
  private int utilization;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getPlanet() {
    return planet;
  }

  public void setPlanet(String planet) {
    this.planet = planet;
  }

  public int getUtilization() {
    return utilization;
  }

  public void setUtilization(int utilization) {
    this.utilization = utilization;
  }
}


















