package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

import static com.designpatterns.creational.builder.food.Drinks.*;
import static com.designpatterns.creational.builder.food.Prices.*;

public class Coke extends ColdDrink {
  @Override
  public String name() {
    return COKE.getName();
  }

  @Override
  public BigDecimal price() {
    return TWO.getPrice();
  }
}