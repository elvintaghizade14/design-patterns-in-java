package com.designpatterns.creational.singleton.other;

import junit.framework.TestCase;
import org.junit.Assert;

public class SingATest extends TestCase {

  public void testGetInstance() {
    SingA instance1 = SingA.getInstance();
    SingA instance2 = SingA.getInstance();

    Assert.assertNotNull(instance1);
    Assert.assertNotNull(instance2);

    Assert.assertSame(instance1, instance2);
  }
}