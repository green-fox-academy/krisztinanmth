package com.greenfoxacademy.matrixchecker.services;

import com.greenfoxacademy.matrixchecker.models.Matrix;
import com.greenfoxacademy.matrixchecker.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrixServiceImpl implements MatrixService {

  MatrixRepository matrixRepository;
  private String message;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public String[] createMatrix(String inputNumbers) {
    return inputNumbers.split("\\r?\\n");
  }

  @Override
  public boolean isMatrixEmpty(String inputNumbers) {
    if (inputNumbers.length() == 0) {
      setMessage("please provide a matrix");
      return true;
    }
    return false;
  }

  @Override
  public boolean isMatrixSquare(String[] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix.length != matrix[i].length()) {
        setMessage("your matrix is not square, please provide a square matrix");
        return false;
      }
    }
    return true;
  }

  @Override
  public String buildMatrixAsString(String[] matrix) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String character : matrix) {
      stringBuilder.append(character);
    }
    return stringBuilder.toString();
  }

  @Override
  public boolean isMatrixIncreasing(String[] matrix) {
    String matrixAsString = buildMatrixAsString(matrix);
    for (int i = 0; i < matrixAsString.length() - 1; i++) {
      if (matrixAsString.charAt(i) < matrixAsString.charAt(i + 1)) {
        setMessage("good, your matrix is increasing");
        return true;
      }
    }
    setMessage("your matrix is decreasing, it should be increasing");
    return true;
  }

  @Override
  public void saveMatrix(String[] matrix) {
    matrixRepository.save(new Matrix(matrix));
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
