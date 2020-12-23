package com.designpatterns.structural.decorator.pizza;

import java.math.BigDecimal;

public class ThickCrustPizza extends Pizza {

  public ThickCrustPizza() {
    super();
    this.description = "Thick Crust Pizza";
    this.cost = new BigDecimal(15.00);
  }

  @Override
  public BigDecimal getCost() {
    return this.cost;
  }
}
