package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.fruit.Apple;
import com.designpatterns.structural.adapter.fruit.AppleAdapter;
import com.designpatterns.structural.adapter.fruit.MoroOrange;
import com.designpatterns.structural.adapter.fruit.Orange;
import junit.framework.TestCase;
import org.junit.Test;

public class AppleAdapterTest extends TestCase {
  private final Orange moroOrange = new MoroOrange();
  private final Apple apple = new AppleAdapter(this.moroOrange);

  @Test
  public void testGetVariety() {
    System.out.println(apple.getVariety());
  }

  public void testEat() {
    apple.eat();
  }
}