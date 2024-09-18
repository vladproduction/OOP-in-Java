package com.app.vp.chapter_8_SOLID.other_principles.hollywood_principle;

/**
 * low-level component implementing NotificationListener interface
 * */
public class EmailNotifier implements NotificationListener{

    @Override
    public void onNotification(String message) {
        System.out.println("EmailNotifier: Sending email notification with message: " + message);
    }
}
