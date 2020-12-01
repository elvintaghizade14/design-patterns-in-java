package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

public enum Prices {
  ONE(1D),
  TWO(2D),
  THREE(3D),
  FOUR(4D),
  FIVE(5D),
  SIX(6D),
  SEVEN(7D),
  EIGHT(8D),
  NINE(9D),
  TEN(10D);

  private final BigDecimal price;

  Prices(Double price) {
    this.price = BigDecimal.valueOf(price);
  }

  public BigDecimal getPrice() {
    return price;
  }
}