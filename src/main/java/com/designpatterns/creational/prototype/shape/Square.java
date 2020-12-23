package com.designpatterns.creational.prototype.shape;

public class Square extends Shape {

  public Square() {
    type = "square";
  }

  @Override
  void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}