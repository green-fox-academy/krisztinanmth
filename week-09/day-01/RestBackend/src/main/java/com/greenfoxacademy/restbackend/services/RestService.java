package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.Log;
import com.greenfoxacademy.restbackend.models.Result;
import java.util.List;

public interface RestService {

  Doubling doubleTheInput(Integer inputNumber);
  Result sumDoUntil(Integer doUntil);
  Result factorDoUntil(Integer doUntil);
  Result sumNumbers(List<Integer> numbers);
  Result multiplyNumbers(List<Integer> numbers);
  Result doubleNumbersInList(List<Integer> numbers);
  void saveLog(String endpoint, String data);
  List<Log> getAllLogs();
}
