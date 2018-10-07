package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.greenfoxacademy.spaceship.repositories.PlanetRepository;
import com.greenfoxacademy.spaceship.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SpaceshipServiceImpl implements SpaceshipService {

  SpaceshipRepository spaceshipRepository;
  PlanetRepository planetRepository;

  @Autowired
  public SpaceshipServiceImpl(SpaceshipRepository spaceshipRepository, PlanetRepository planetRepository) {
    this.spaceshipRepository = spaceshipRepository;
    this.planetRepository = planetRepository;
  }

  @Override
  public Spaceship findById(Long id) {
    return spaceshipRepository.findById(1L).get();
  }

  @Override
  public void moveShipToPlanet(Long id) {
    Planet planet = planetRepository.findById(id).get();
    Spaceship spaceship = spaceshipRepository.findById(id).get();
    String planetName = planet.getName();

    if (planetName.equals(spaceship.getPlanetName())) {
      return;
    }
    spaceship.setPlanetName(planetName);
    spaceshipRepository.save(spaceship);
  }
}
