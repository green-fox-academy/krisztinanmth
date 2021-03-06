package com.greenfoxacademy.spacetravel.services;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import com.greenfoxacademy.spacetravel.repositories.PlanetRepository;
import com.greenfoxacademy.spacetravel.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements SpaceService {

  PlanetRepository planetRepository;
  SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
  }

  @Override
  public List<Planet> getPlanets() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getShip(long id) {
    return spaceshipRepository.findById(id).get();
  }

  @Override
  public void moveShipToPlanet(long shipId, long planetId) {
    Planet planet = planetRepository.findById(planetId).get();
    Spaceship ship = spaceshipRepository.findById(shipId).get();
    String planetName = planet.getName();

    if (planetName.equals(ship.getPlanet())) {
      return;
    }

    ship.setPlanet(planetName);
    spaceshipRepository.save(ship);
  }

  @Override
  public void movePeopleToShip(long shipId, long planetId) {
    Planet planet = planetRepository.findById(planetId).get();
    Spaceship ship = spaceshipRepository.findById(shipId).get();

    int freeShipCapacity = ship.getCapacity() - ship.getUtilization();

    if (freeShipCapacity == 0) {
      return;
    }

    long planetPopulation = planet.getPopulation();

    if (planetPopulation < freeShipCapacity) {
      ship.changeUtilization((int) planetPopulation);
      planet.setPopulation(0);
    } else {
      ship.changeUtilization(freeShipCapacity);
      planet.changePopulation(-freeShipCapacity);
    }
    planetRepository.save(planet);
    spaceshipRepository.save(ship);
  }

  @Override
  public void movePeopleToPlanet(long shipId, long planetId) {
    Planet planet = planetRepository.findById(planetId).get();
    Spaceship ship = spaceshipRepository.findById(shipId).get();

    int peopleOnShip = ship.getUtilization();

    planet.changePopulation(peopleOnShip);
    ship.setUtilization(0);

    planetRepository.save(planet);
    spaceshipRepository.save(ship);
  }
}













