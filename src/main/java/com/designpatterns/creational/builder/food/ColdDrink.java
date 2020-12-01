package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

public abstract class ColdDrink implements Item {
  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract BigDecimal price();
}