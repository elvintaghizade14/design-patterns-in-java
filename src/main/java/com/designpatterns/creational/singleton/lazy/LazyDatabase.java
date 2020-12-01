package com.designpatterns.creational.singleton.lazy;

public class LazyDatabase {
  private static LazyDatabase LAZY_DATABASE;

  private LazyDatabase() {

  }

  public static LazyDatabase getLazyDatabase() {
    if (LAZY_DATABASE == null) {
      synchronized (LazyDatabase.class) {
        if (LAZY_DATABASE == null) LAZY_DATABASE = new LazyDatabase();
      }
    }
    return LAZY_DATABASE;
  }
}