package com.designpatterns.structural.adapter.fruit;

public class AppleAdapter implements Apple {
  private final Orange orange;

  public AppleAdapter(Orange orange) {
    this.orange = orange;
  }

  @Override
  public String getVariety() {
    return this.orange.getVariety();
  }

  @Override
  public void eat() {
    this.orange.peel();
    this.orange.eat();
  }
}