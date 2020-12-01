package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

import static com.designpatterns.creational.builder.food.Prices.*;

public class ChickenBurger extends Burger {
  @Override
  public String name() {
    return "Chicken Burger";
  }

  @Override
  public BigDecimal price() {
    return TEN.getPrice();
  }
}
