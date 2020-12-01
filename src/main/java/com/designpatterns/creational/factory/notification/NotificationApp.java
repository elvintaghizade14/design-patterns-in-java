package com.designpatterns.creational.factory.notification;

public class NotificationApp {
  public static void main(String[] args) {
    NotificationFactory notificationFactory = new NotificationFactory();

    Notification smsNotification = notificationFactory.createNotification("sms");
    smsNotification.notifyUser();

    Notification pushNotification = notificationFactory.createNotification("push");
    pushNotification.notifyUser();

    Notification emailNotification = notificationFactory.createNotification("email");
    emailNotification.notifyUser();
  }
}