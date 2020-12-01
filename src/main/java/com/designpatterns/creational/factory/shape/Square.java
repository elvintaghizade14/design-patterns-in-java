package com.designpatterns.creational.factory.shape;

public class Square implements Shape{

  @Override
  public void draw() {
    System.out.println("Inside Square::draw()");
  }
}