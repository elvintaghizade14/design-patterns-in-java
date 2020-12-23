package com.designpatterns.creational.prototype.shape;

public class PrototypeApp {
  public static void main(String[] args) {
    ShapeCache.loadCache();

    Shape shape = ShapeCache.getShape("1");
    System.out.println("Shape : " + shape.getType());

    Shape clonedShape2 = ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());

    Shape clonedShape3 = ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());
  }
}