package com.greenfoxacademy.shelterapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long Id;
  private String name;
  private String color;
  private int age;

  public Animal() {
  }

  public Animal(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
























