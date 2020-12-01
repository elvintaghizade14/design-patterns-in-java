package com.designpatterns.creational.factory.shape;

public enum Shapes {
  SQUARE ("square"),
  CIRCLE("circle"),
  RECTANGLE("rectangle");

  private final String name;

  Shapes(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
