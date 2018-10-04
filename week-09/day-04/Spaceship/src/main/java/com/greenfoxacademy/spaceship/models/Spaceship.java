package com.greenfoxacademy.spaceship.models;

import javax.persistence.*;


@Entity
public class Spaceship {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "max_capacity")
  private Integer maxCapacity;
  @Column(name = "planet")
  private String planetName;
  private Integer utilization;

//  public Spaceship() {
//  }
//
//  public Spaceship(String planetName) {
//    this.planetName = planetName;
//  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public String getPlanetName() {
    return planetName;
  }

  public void setPlanetName(String planetName) {
    this.planetName = planetName;
  }

  public Integer getUtilization() {
    return utilization;
  }

  public void setUtilization(Integer utilization) {
    this.utilization = utilization;
  }
}
