package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

import static com.designpatterns.creational.builder.food.Drinks.*;
import static com.designpatterns.creational.builder.food.Prices.*;

public class Pepsi extends ColdDrink {
  @Override
  public String name() {
    return PEPSI.getName();
  }

  @Override
  public BigDecimal price() {
    return THREE.getPrice();
  }
}