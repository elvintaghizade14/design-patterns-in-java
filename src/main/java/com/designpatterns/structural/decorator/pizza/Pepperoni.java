package com.designpatterns.structural.decorator.pizza;

import java.math.BigDecimal;

public class Pepperoni extends PizzaIngredient {
  private final Pizza pizza;

  public Pepperoni(Pizza pizza) {
    super();
    this.pizza = pizza;
  }

  @Override
  public BigDecimal getCost() {
    return (new BigDecimal(15.00)).add(this.pizza.getCost());
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " + pepperoni";
  }
}
