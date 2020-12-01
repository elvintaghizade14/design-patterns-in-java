package com.designpatterns.creational.singleton;

import com.designpatterns.creational.singleton.early.EarlyDatabase;
import com.designpatterns.creational.singleton.lazy.LazyDatabase;

public class SingletonApp {
  public static void main(String[] args) {

    EarlyDatabase earlyDatabase = EarlyDatabase.getDatabase();
    LazyDatabase lazyDatabase = LazyDatabase.getLazyDatabase();

    // do some operations:

  }
}