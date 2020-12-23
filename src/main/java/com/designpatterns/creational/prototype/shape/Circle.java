package com.designpatterns.creational.prototype.shape;

public class Circle extends Shape {
  public Circle() {
    type = "circle";
  }

  @Override
  void draw() {
    System.out.println("Inside Circle:draw() method.");
  }
}