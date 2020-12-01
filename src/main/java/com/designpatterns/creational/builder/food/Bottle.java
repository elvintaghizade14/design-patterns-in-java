package com.designpatterns.creational.builder.food;

public class Bottle implements Packing {

  @Override
  public String pack() {
    return "Bottle";
  }

  @Override
  public String toString() {
    return pack();
  }
}