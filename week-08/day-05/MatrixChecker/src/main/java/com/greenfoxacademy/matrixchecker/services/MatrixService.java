package com.greenfoxacademy.matrixchecker.services;

public interface MatrixService {

  String printMessages(String inputNumbers);
  int[][] createMatrix(String inputNumbers);
  boolean checkSquare(int[][] createdMatrix);
  boolean checkIfIncreasing(int[][] createdMatrix);
}
