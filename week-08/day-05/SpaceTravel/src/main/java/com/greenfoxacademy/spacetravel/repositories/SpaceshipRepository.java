package com.greenfoxacademy.spacetravel.repositories;

import com.greenfoxacademy.spacetravel.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
}
