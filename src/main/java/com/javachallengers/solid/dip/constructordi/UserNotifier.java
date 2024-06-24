package com.javachallengers.solid.dip.constructordi;

public class UserNotifier {
    private final NotificationService notificationService;

    public UserNotifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String recipient, String message) {
        notificationService.sendNotification(recipient, message);
    }
}