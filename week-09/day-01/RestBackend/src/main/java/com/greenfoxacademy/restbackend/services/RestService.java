package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.Result;

public interface RestService {

  Doubling doubleTheInput(Integer inputNumber);
  Result sumDoUntil(Integer doUntil);
  Result factorDoUntil(Integer doUntil);
}
