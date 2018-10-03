package com.greenfoxacademy.shelterapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelter {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  @OneToMany(cascade = CascadeType.ALL) //here with cascade all - strong relationship
  private List<Animal> animals;         //meaning i don't need to save the animal separately into
                                        //the animal table...when i create it in the shelter
                                        //it will get saved automatically into the animals table
  public Shelter() {
    this(null);   //so we can just instantiate the List at one place in the other constructor
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
