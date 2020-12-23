package com.designpatterns.creational.factory.animal.factory;

public interface Pet {
  void setName(String name);
  String getName();
  String getType();
  boolean isHungry();
  void feed();
}