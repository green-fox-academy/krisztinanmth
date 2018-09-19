package com.greenfoxacademy.day3exercises;

import com.greenfoxacademy.day3exercises.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3exercisesApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(Day3exercisesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello bello");
  }
}


