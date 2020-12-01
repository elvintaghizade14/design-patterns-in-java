package com.designpatterns.creational.factory.notification;

public enum Notifications {
  SMS ("sms"),
  PUSH ("push"),
  EMAIL ("email");

  private final String name;

  Notifications(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }



  @Override
  public String toString() {
    return String.format("Notification[name='%s']", name);
  }
}