package com.greenfoxacademy.spaceship.services;


import com.greenfoxacademy.spaceship.models.Spaceship;

public interface SpaceshipService {

  Spaceship findById(Long id);
  void moveShipToPlanet(Long id);
}
