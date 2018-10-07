package com.greenfoxacademy.alopexorientationexampractise.models;

import java.util.ArrayList;
import java.util.List;

public class ListOfAttractions {

  private List<Attraction> attractions;

  public ListOfAttractions() {
    attractions = new ArrayList<>();
  }

  public ListOfAttractions(List<Attraction> listOfAttractions) {
    this.attractions = listOfAttractions;
  }

  public List<Attraction> getListOfAttractions() {
    return attractions;
  }

  public void setListOfAttractions(List<Attraction> listOfAttractions) {
    this.attractions = listOfAttractions;
  }

  public void addCheapestAttracyion(Attraction attractions) {
    this.attractions.add(attractions);
  }
}

