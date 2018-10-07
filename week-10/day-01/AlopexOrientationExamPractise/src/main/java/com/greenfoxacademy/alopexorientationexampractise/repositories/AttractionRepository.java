package com.greenfoxacademy.alopexorientationexampractise.repositories;

import com.greenfoxacademy.alopexorientationexampractise.models.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {

}
