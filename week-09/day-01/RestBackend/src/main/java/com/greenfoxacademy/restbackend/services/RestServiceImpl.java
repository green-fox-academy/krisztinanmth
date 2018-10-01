package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Doubling;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {


  @Override
  public Doubling doubleTheInput(Integer inputNumber) {
    Doubling doubling = new Doubling(inputNumber, inputNumber * 2);
    return doubling;
  }
}
