package com.greenfoxacademy.matrixchecker.services;

public interface MatrixService {

  String[] createMatrix(String inputNumbers);
  boolean isMatrixEmpty(String inputNumbers);
  boolean isMatrixSquare(String[] matrix);
  String buildMatrixAsString(String[] matrix);
  boolean isMatrixIncreasing(String[] matrix);
  void saveMatrix(String[] matrix);
  String getMessage();
}
