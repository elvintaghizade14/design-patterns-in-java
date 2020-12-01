package com.designpatterns.creational.builder.food;

public enum Drinks {
  PEPSI("Pepsi"),
  COKE("Coke");

  private final String name;

  Drinks(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}