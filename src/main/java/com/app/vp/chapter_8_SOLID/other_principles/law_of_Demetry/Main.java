package com.app.vp.chapter_8_SOLID.other_principles.law_of_Demetry;

public class Main {
    public static void main(String[] args) {
        // Create a Car with 250 horsepower
        Car myCar = new Car(250);

        // Create a Driver for the Car
        Driver driver = new Driver(myCar);

        // Driver attempts to start the car
        driver.drive(); // Should indicate that the car started since all wheels are operational

        // Simulate a wheel going flat
        driver.changeWheelStatus(1, true); // Wheel 1 gets flat

        // Driver attempts to drive again
        driver.drive(); // Should indicate failure to start because one wheel is flat

        // Fix the flat wheel
        driver.changeWheelStatus(1, false); // Wheel 1 is back to operational

        // Driver attempts to start the car again
        driver.drive(); // Should indicate that the car has started successfully now
    }
}
