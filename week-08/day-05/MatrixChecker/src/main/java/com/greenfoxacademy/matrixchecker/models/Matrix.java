package com.greenfoxacademy.matrixchecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String date;
  private int[][] matrixNumbers;

  public Matrix() {
    date = new SimpleDateFormat("yyyyMMdd_HH:mm:ss").format(Calendar.getInstance().getTime());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int[][] getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(int[][] matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }
}
