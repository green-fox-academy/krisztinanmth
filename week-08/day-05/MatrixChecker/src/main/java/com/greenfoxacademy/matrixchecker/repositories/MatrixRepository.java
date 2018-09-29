package com.greenfoxacademy.matrixchecker.repositories;

import com.greenfoxacademy.matrixchecker.models.Matrix;
import org.springframework.data.repository.CrudRepository;

public interface MatrixRepository extends CrudRepository<Matrix, Long> {
  
}
