package com.greenfoxacademy.alopexorientationexampractise.repositories;

import com.greenfoxacademy.alopexorientationexampractise.models.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {

  List<Attraction> findAll();
  List<Attraction> findAllByCategoryOrderByPriceAsc(String category);
}
