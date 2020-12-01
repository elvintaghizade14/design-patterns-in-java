package com.designpatterns.creational.builder.food;

public class Wrapper implements Packing {

  @Override
  public String pack() {
    return "Wrapper";
  }

  @Override
  public String toString() {
    return pack();
  }
}