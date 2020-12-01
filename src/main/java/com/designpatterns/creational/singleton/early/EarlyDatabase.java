package com.designpatterns.creational.singleton.early;

public class EarlyDatabase {
  private static final EarlyDatabase EARLY_DATABASE = new EarlyDatabase();

  private EarlyDatabase() {

  }

  public static EarlyDatabase getDatabase() {
    return EARLY_DATABASE;
  }
}