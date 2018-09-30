package com.greenfoxacademy.matrixchecker.services;

import com.greenfoxacademy.matrixchecker.models.Matrix;
import com.greenfoxacademy.matrixchecker.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrixServiceImpl implements MatrixService {

  MatrixRepository matrixRepository;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public String printMessages(String inputNumbers) {
    int[][] createdMatrix = createMatrix(inputNumbers);
    if (!checkSquare(createdMatrix))
      return "the matrix is not square, please try again";
    if (!checkIfIncreasing(createdMatrix)) {
      return "the matrix is not increasing";
    }
    matrixRepository.save(new Matrix(createdMatrix, inputNumbers));
    return "the matrix is increasing";
  }


  @Override
  public boolean checkSquare(int[][] createdMatrix) {
    for (int i = 0; i < createdMatrix.length; i++) {
      if (createdMatrix.length != createdMatrix[i].length) {
        return false;
      }
    }
    return true;
  }

  @Override
  public int[][] createMatrix(String inputNumbers) {
    String lines[] = inputNumbers.split("\\r?\\n");
    String[][] charsInLines = new String[lines.length][];
    for (int i = 0; i < lines.length ; i++) {
      charsInLines[i] = lines[i].split(" ");
    }
    int[][] createdMatrix = new int[charsInLines.length][charsInLines[0].length];
    for (int i = 0; i < charsInLines.length; i++) {
      for (int j = 0; j < charsInLines.length; j++) {
        createdMatrix[i][j] = Integer.parseInt(charsInLines[i][j]);
      }
    }
    return createdMatrix;
  }

//  @Override
//  public void printValidationMessage(Matrix matrix) {
//    if (matrix.isSquare()) {
//      matrixRepository.save(matrix);
//      matrix.setValidationMessage("this is a valid square matrix");
//    }
//    matrix.setValidationMessage("this matrix is not valid, please provide a square matrix");
//  }
//
  @Override
  public boolean checkIfIncreasing(int[][] createdMatrix) {
    for (int i = 0; i < createdMatrix.length; i++) {
      for (int j = 0; j < createdMatrix[i].length; j++) {
        if (createdMatrix[i][j] < createdMatrix[i][j + 1] && createdMatrix[i][j] < createdMatrix[i + 1][j]) {
          return true;
        }
      }
    } return false;
  }
}
