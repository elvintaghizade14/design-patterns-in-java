package com.designpatterns.creational.builder.food;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Meal {
  private List<Item> items = new ArrayList<>();

  public List<Item> addItem(Item item) {
    items.add(item);
    return this.items;
  }

  public double getCost() {
    return items.stream()
            .map(Item::price)
            .mapToDouble(BigDecimal::doubleValue)
            .sum();
  }

  public String showItems() {
    return this.items.stream()
            .map(Item::represent)
            .collect(Collectors.joining("\n"));
  }
}