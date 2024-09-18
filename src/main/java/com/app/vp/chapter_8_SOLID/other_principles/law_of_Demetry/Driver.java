package com.app.vp.chapter_8_SOLID.other_principles.law_of_Demetry;

public class Driver {

    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive(){
        car.startCar(); // Calls method on Car which uses contained objects
    }

    public void changeWheelStatus(int wheelIndex, boolean isFlat) {
        car.setWheelFlat(wheelIndex, isFlat);
    }
}
