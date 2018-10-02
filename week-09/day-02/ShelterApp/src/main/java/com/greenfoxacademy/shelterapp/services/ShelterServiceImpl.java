package com.greenfoxacademy.shelterapp.services;

import com.greenfoxacademy.shelterapp.models.Shelter;
import com.greenfoxacademy.shelterapp.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterServiceImpl implements ShelterService {

  ShelterRepository shelterRepository;

  @Autowired
  public ShelterServiceImpl(ShelterRepository shelterRepository) {
    this.shelterRepository = shelterRepository;
  }

  @Override
  public Shelter createShelter(String shelterName) {
    Shelter shelter = new Shelter((shelterName));
    shelterRepository.save(shelter);
    return shelter;
  }

  @Override
  public List<Shelter> getShelters() {
    return shelterRepository.findAll();
  }
}
