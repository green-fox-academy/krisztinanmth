package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SpaceshipServiceImpl implements SpaceshipService {

  SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceshipServiceImpl(SpaceshipRepository spaceshipRepository) {
    this.spaceshipRepository = spaceshipRepository;
  }
}
