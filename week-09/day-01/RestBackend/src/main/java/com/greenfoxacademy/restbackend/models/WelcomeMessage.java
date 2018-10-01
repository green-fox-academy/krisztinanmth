package com.greenfoxacademy.restbackend.models;

public class WelcomeMessage {

  private String welcome_message;

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String name, String title) {
    this.welcome_message = String.format("Oh, hi there %s, my dear %s!", name, title);
  }
}
