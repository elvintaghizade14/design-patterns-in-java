package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

import static com.designpatterns.creational.builder.food.Prices.*;

public class VegetarianBurger extends Burger {

  @Override
  public String name() {
    return "Vegetarian Burger";
  }

  @Override
  public BigDecimal price() {
    return FIVE.getPrice();
  }
}