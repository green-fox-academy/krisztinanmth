package com.greenfoxacademy.alopexorientationexampractise.services;

import com.greenfoxacademy.alopexorientationexampractise.models.Attraction;
import com.greenfoxacademy.alopexorientationexampractise.models.Attractions;
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
  public Attraction createNewAttraction(Attraction newAttraction) {
    return attractionRepository.save(newAttraction);
  }

  @Override
  public Attraction findById(Long id) {
    return attractionRepository.findById(id).get();
  }

  @Override
  public Attractions findCheapestAttractions() {
    Attractions cheapestAttractions = new Attractions();
    cheapestAttractions.addCheapestAttraction(attractionRepository.findAllByCategoryOrderByPriceAsc("restaurant").get(0));
    cheapestAttractions.addCheapestAttraction(attractionRepository.findAllByCategoryOrderByPriceAsc("park").get(0));
    cheapestAttractions.addCheapestAttraction(attractionRepository.findAllByCategoryOrderByPriceAsc("museum").get(0));
    return cheapestAttractions;
  }


}
