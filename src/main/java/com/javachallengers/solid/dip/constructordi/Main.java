package com.javachallengers.solid.dip.constructordi;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();
        
        UserNotifier emailNotifier = new UserNotifier(emailService);
        UserNotifier smsNotifier = new UserNotifier(smsService);

        emailNotifier.notifyUser("user@example.com", "Welcome to our service!");
        smsNotifier.notifyUser("123-456-7890", "Your verification code is 1234");
    }
}