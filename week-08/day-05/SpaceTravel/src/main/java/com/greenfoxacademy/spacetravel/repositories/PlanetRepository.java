package com.greenfoxacademy.spacetravel.repositories;

import com.greenfoxacademy.spacetravel.models.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
