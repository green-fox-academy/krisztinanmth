package com.greenfoxacademy.shelterapp.services;

import com.greenfoxacademy.shelterapp.models.Shelter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShelterService {

  Shelter createShelter(String shelterName);
  List<Shelter> getShelters();
  Shelter getShelterById(Long id);
}















