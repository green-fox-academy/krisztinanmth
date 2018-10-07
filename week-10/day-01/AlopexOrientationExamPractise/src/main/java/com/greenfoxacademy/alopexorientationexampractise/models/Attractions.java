package com.greenfoxacademy.alopexorientationexampractise.models;

import java.util.ArrayList;
import java.util.List;

public class Attractions {

  private List<Attraction> cheapestAttractions;

  public Attractions() {
    cheapestAttractions = new ArrayList<>();
  }

  public Attractions(List<Attraction> attractions) {
    this.cheapestAttractions = attractions;
  }

  public List<Attraction> getListOfAttractions() {
    return cheapestAttractions;
  }

  public void setListOfAttractions(List<Attraction> listOfAttractions) {
    this.cheapestAttractions = listOfAttractions;
  }

  public void addCheapestAttraction(Attraction attractions) {
    this.cheapestAttractions.add(attractions);
  }
}

