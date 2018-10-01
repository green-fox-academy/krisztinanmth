package com.greenfoxacademy.restbackend.repositories;

import com.greenfoxacademy.restbackend.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LogRepository extends CrudRepository {

  List<Log> findAll();
}
