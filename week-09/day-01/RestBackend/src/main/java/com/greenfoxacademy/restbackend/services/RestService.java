package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Doubling;

public interface RestService {

  Doubling doubleTheInput(Integer inputNumber);
}
