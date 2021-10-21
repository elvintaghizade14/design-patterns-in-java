package com.designpatterns.creational.singleton.other;

public class DoubleCheckedLocking {
  private static DoubleCheckedLocking INSTANCE;

  private DoubleCheckedLocking() {
    super();
  }

  public static DoubleCheckedLocking getINSTANCE() {
    if (INSTANCE == null) {
      synchronized (DoubleCheckedLocking.class) {
        if (INSTANCE == null) INSTANCE = new DoubleCheckedLocking();
      }
    }
    return INSTANCE;
  }
}