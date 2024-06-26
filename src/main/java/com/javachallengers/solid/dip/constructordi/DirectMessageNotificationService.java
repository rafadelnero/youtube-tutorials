package com.javachallengers.solid.dip.constructordi;

public class DirectMessageNotificationService implements NotificationService{
  @Override
  public void sendNotification(String recipient, String message) {
    System.out.println("Sending direct message!");
  }
}
