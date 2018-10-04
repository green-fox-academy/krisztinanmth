package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlanetServiceImpl implements PlanetService {

  PlanetRepository planetRepository;

  @Autowired
  public PlanetServiceImpl(PlanetRepository planetRepository) {
    this.planetRepository = planetRepository;
  }

  @Override
  public List<Planet> getAllPlanets() {
    return planetRepository.findAll();
  }
}
