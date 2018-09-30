package com.greenfoxacademy.matrixchecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDateTime date;
  private int[][] matrixNumbers;
  private String inputNumbers;

  public Matrix() {
  }

  public Matrix(int[][] createdMatrix, String inputNumbers) {
    this.date = LocalDateTime.now();
    this.matrixNumbers = createdMatrix;
    this.inputNumbers = inputNumbers;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int[][] getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(int[][] matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public String getInputNumbers() {
    return inputNumbers;
  }

  public void setInputNumbers(String inputNumbers) {
    this.inputNumbers = inputNumbers;
  }
}
