package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.Result;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {


  @Override
  public Doubling doubleTheInput(Integer inputNumber) {
    Doubling doubling = new Doubling(inputNumber, inputNumber * 2);
    return doubling;
  }

  @Override
  public Result sumDoUntil(Integer doUntil) {
    Result result = new Result();
    int temp = 0;
    for (int i = 0; i <= doUntil; i++) {
      temp += i;
    }
    result.setResult(temp);
    return result;
  }

  @Override
  public Result factorDoUntil(Integer doUntil) {
    Result result = new Result();
    int temp = 1;
    for (int i = 1; i <= doUntil; i++) {
      temp *= i;
    }
    result.setResult(temp);
    return result;
  }
}
