package com.greenfoxacademy.spacetravel.services;

import com.greenfoxacademy.spacetravel.models.Planet;
import com.greenfoxacademy.spacetravel.models.Spaceship;
import java.util.List;

public interface SpaceService {

  List<Planet> getPlanets();
  Spaceship getShip(long id);
  void moveShipToPlanet(long shipId, long planetId);
  void movePeopleToShip(long shipId, long planetId);
}
