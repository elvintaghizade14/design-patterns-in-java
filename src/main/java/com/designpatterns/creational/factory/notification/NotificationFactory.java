package com.designpatterns.creational.factory.notification;

import static com.designpatterns.creational.factory.notification.Notifications.*;

public class NotificationFactory {

  public Notification createNotification(String notification) {
//    I DON'T LIKE NULL! JUST THROW AN EXCEPTION!
//    if (notification == null || notification.isEmpty()) return null;
    if (SMS.getName().equalsIgnoreCase(notification)) return new SMSNotification();
    else if (PUSH.getName().equalsIgnoreCase(notification)) return new PushNotification();
    else if (EMAIL.getName().equalsIgnoreCase(notification)) return new EmailNotification();
    else throw new IllegalStateException("Unexpected value: " + notification);
  }
}