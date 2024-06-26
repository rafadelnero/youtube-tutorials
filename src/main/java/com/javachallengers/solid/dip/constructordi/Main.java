package com.javachallengers.solid.dip.constructordi;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();
        NotificationService dmService = new DirectMessageNotificationService();

        UserNotifier emailNotifier = new UserNotifier(emailService);
        UserNotifier smsNotifier = new UserNotifier(smsService);
        UserNotifier dmNotifier = new UserNotifier(dmService);

        emailNotifier.notifyUser("user@example.com", "Welcome to our service!");
        smsNotifier.notifyUser("123-456-7890", "Your verification code is 1234");
        dmNotifier.notifyUser("@UserExample", "Your verification code is 1234");
    }
}