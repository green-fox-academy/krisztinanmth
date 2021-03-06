package com.greenfoxacademy.alopexorientationexampractise.services;

import com.greenfoxacademy.alopexorientationexampractise.models.Attraction;
import com.greenfoxacademy.alopexorientationexampractise.models.Attractions;

import java.util.List;


public interface AttractionService {

  List<Attraction> getAllAttractions();
  Attraction createNewAttraction(Attraction newAttraction);
  Attraction findById(Long id);
  Attractions findCheapestAttractions();
}
