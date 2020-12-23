package com.designpatterns.structural.decorator.pizza;

import java.math.BigDecimal;

public abstract class Pizza {
  protected String description;
  protected BigDecimal cost;

  public String getDescription() {
    return description;
  }

  public BigDecimal getCost() {
    return cost;
  }
}