package com.app.vp.chapter_8_SOLID.other_principles.hollywood_principle;


import java.util.ArrayList;
import java.util.List;

/**
 * height-level component managing notifications
 * */
public class NotificationService {

    List<NotificationListener> listeners  = new ArrayList();

    //method to register a listener:
    public void registerListener(NotificationListener listener){
        listeners.add(listener);
    }

    //method to send a notification, triggering callbacks:
    public void sendNotification(String message){
        System.out.println("NotificationService: Sending notification: " + message);
        for (NotificationListener listener : listeners) {
            listener.onNotification(message);
        }
    }

}
