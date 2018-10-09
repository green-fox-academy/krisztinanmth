package com.greenfoxacademy.alopexorientationexampractise.models;

import java.util.ArrayList;
import java.util.List;

public class Attractions {

  private List<Attraction> attractions;

  public Attractions() {
    attractions = new ArrayList<>();
  }

  public Attractions(List<Attraction> attractions) {
    this.attractions = attractions;
  }

  public List<Attraction> getListOfAttractions() {
    return attractions;
  }

  public void setListOfAttractions(List<Attraction> listOfAttractions) {
    this.attractions = listOfAttractions;
  }

  public void addCheapestAttraction(Attraction attractions) {
    this.attractions.add(attractions);
  }
}

