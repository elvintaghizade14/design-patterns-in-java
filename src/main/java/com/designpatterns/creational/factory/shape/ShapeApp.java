package com.designpatterns.creational.factory.shape;

import static com.designpatterns.creational.factory.shape.Shapes.*;

public class ShapeApp {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape circle = shapeFactory.getShape(CIRCLE.getName());
    circle.draw();

    Shape square = shapeFactory.getShape(SQUARE.getName());
    square.draw();

    Shape rectangle = shapeFactory.getShape(RECTANGLE.getName());
    rectangle.draw();

    /*
    Shape elvinShape = shapeFactory.getShape("Elvin");
    elvinShape.draw();

    Shape nullShape = shapeFactory.getShape(null);
    nullShape.draw();
     */
  }
}