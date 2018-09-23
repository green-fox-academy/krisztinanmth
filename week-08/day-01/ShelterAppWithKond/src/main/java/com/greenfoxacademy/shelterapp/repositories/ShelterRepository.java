package com.greenfoxacademy.shelterapp.repositories;

import com.greenfoxacademy.shelterapp.models.Shelter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShelterRepository extends CrudRepository<Shelter, Long> {

  List<Shelter> findAll();
}
