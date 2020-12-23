package com.designpatterns.structural.decorator.pizza;

import junit.framework.TestCase;
import org.junit.Test;

public class PizzaTest extends TestCase {

  @Test
  public void testMultiplyPizza() {
    Pizza thickCrustPizza = new ThickCrustPizza();
    System.out.println(thickCrustPizza.getDescription());
    System.out.println(thickCrustPizza.getCost());

    Pizza pepperoni = new Pepperoni(thickCrustPizza);
    System.out.println(pepperoni.getDescription());
    System.out.println(pepperoni.getCost());

    Pizza doublePepperoni = new Pepperoni(pepperoni);
    System.out.println(doublePepperoni.getDescription());
    System.out.println(doublePepperoni.getCost());
  }

  @Test
  public void testGetDescription() {

  }

  @Test
  public void testGetCost() {
  }
}