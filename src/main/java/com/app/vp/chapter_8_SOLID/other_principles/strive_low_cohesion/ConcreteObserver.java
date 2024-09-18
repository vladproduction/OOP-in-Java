package com.app.vp.chapter_8_SOLID.other_principles.strive_low_cohesion;

public class ConcreteObserver implements IObserver {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + " received message: " + msg);
    }
}
