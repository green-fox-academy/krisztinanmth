package com.greenfoxacademy.alopexorientationexampractise.services;

import com.greenfoxacademy.alopexorientationexampractise.models.Attraction;
import com.greenfoxacademy.alopexorientationexampractise.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AttractionServiceImpl implements AttractionService{

  private AttractionRepository attractionRepository;

  @Autowired
  public AttractionServiceImpl(AttractionRepository attractionRepository) {
    this.attractionRepository = attractionRepository;
  }

  @Override
  public List<Attraction> getAllAttractions() {
    return attractionRepository.findAll();
  }

  @Override
  public Attraction creteNewAttraction(Attraction newAttraction) {
    return attractionRepository.save(newAttraction);
  }


}
