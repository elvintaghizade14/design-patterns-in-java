package com.designpatterns.creational.builder.food;

public class FoodApp {
  public static void main(String[] args) {

    MealBuilder mealBuilder = new MealBuilder();

    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    String nonVegMealItems = nonVegMeal.showItems();
    System.out.println(nonVegMealItems);

    Meal vegMeal = mealBuilder.prepareVegMeal();
    String vegMealItems = vegMeal.showItems();
    System.out.println(vegMealItems);
  }
}