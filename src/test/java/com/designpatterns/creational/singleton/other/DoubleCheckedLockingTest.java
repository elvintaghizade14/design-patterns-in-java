package com.designpatterns.creational.singleton.other;

import junit.framework.TestCase;
import org.junit.Assert;

public class DoubleCheckedLockingTest extends TestCase {

  public void testGetInstance() {
    DoubleCheckedLocking instance1 = DoubleCheckedLocking.getINSTANCE();
    DoubleCheckedLocking instance2 = DoubleCheckedLocking.getINSTANCE();

    Assert.assertNotNull(instance1);
    Assert.assertNotNull(instance2);

    Assert.assertSame(instance1, instance2);
  }
}