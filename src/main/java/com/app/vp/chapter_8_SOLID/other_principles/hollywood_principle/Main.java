package com.app.vp.chapter_8_SOLID.other_principles.hollywood_principle;

public class Main {
    public static void main(String[] args) {

        //creating instance of NotificationService:
        NotificationService notificationService = new NotificationService();

        //create low-level components:
        EmailNotifier emailNotifier = new EmailNotifier();
        SmsNotifier smsNotifier = new SmsNotifier();

        //register the listeners with the notification service:

        notificationService.registerListener(emailNotifier);
        notificationService.registerListener(smsNotifier);

        //sending notification:
        notificationService.sendNotification("Hello, this is test notification!");

    }
}
