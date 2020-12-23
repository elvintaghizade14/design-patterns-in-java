package com.designpatterns.creational.factory.animal.factory;

public class Dog implements Pet {
  private String name;
  private final String type = "dog";
  private boolean hungry = true;

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public boolean isHungry() {
    return hungry;
  }

  @Override
  public void feed() {
    this.hungry = false;
  }

  @Override
  public String toString() {
    return String.format("Dog[name='%s', hungry=%s]", name, hungry);
  }
}