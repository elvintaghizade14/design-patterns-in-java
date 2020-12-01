package com.designpatterns.creational.factory.shape;

import static com.designpatterns.creational.factory.shape.Shapes.*;

public class ShapeFactory {
  public Shape getShape(String shapeName) {
    if (CIRCLE.getName().equalsIgnoreCase(shapeName)) return new Circle();
    else if (SQUARE.getName().equalsIgnoreCase(shapeName)) return new Rectangle();
    else if (RECTANGLE.getName().equalsIgnoreCase(shapeName)) return new Square();
    else throw new IllegalArgumentException("Unexpected value: " + shapeName);
  }
}