package com.greenfoxacademy.matrixchecker.repositories;

import com.greenfoxacademy.matrixchecker.models.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix, Long> {

  List<Matrix> findAll();
}
