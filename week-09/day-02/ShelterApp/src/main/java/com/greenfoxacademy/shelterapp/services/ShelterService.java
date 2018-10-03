package com.greenfoxacademy.shelterapp.services;

import com.greenfoxacademy.shelterapp.models.Shelter;
import java.util.List;

public interface ShelterService {

  Shelter createShelter(String shelterName);
  List<Shelter> getShelters();
  Shelter getShelterById(Long id);
}
