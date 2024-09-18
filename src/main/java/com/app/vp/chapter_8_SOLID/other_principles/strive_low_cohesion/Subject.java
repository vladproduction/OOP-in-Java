package com.app.vp.chapter_8_SOLID.other_principles.strive_low_cohesion;


import java.util.ArrayList;
import java.util.List;

/**
 * class to be observed
 * */
public class Subject {

    private List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public void doSomething() {
        // logic
        System.out.println("Subject is doing something...");
        notifyObservers("Subject has completed an action!");
    }

}
