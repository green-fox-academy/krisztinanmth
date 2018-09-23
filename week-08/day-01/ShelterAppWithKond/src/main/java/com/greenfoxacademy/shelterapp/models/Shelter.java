package com.greenfoxacademy.shelterapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelter {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Animal> animals;

  public Shelter() {
    this(null);
  }

  public Shelter(String name) {
    animals = new ArrayList<>();
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  public void setAnimals(List<Animal> animals) {
    this.animals = animals;
  }
}















