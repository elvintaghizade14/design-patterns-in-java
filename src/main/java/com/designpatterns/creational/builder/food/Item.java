package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;

public interface Item {
  String name();

  Packing packing();

  BigDecimal price();

  default String represent() {
    return String.format("name is: %s\npacking is: %s\nprice is: %s\n",
            name(), packing(), price());
  }
}