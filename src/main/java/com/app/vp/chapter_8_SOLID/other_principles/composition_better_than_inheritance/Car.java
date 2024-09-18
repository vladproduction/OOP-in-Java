package com.app.vp.chapter_8_SOLID.other_principles.composition_better_than_inheritance;

/**
 * class using composition
 * */
public class Car {

    private Engine engine; //engine is composed with car

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void start(){
        System.out.println("Car is started");
        engine.start();
    }
}
