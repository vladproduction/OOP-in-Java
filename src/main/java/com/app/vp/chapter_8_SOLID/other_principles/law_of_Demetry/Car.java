package com.app.vp.chapter_8_SOLID.other_principles.law_of_Demetry;

public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private Dashboard dashboard;

    public Car(int horsepower) {
        this.engine = new Engine(horsepower);
        this.wheels = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        this.dashboard = new Dashboard();
    }

    public boolean areWheelsOperational() {
        for (Wheel wheel : wheels) {
            if (wheel.isFlat()) {
                return false; // Calls method from contained object (Wheel)
            }
        }
        return true;
    }

    public void setWheelFlat(int index, boolean isFlat) {
        if (index >= 0 && index < wheels.length) {
            wheels[index].setFlat(isFlat); // Calls method from contained object (Wheel)
            String status = isFlat ? "flat" : "operational";
            dashboard.displayStatus("Wheel " + index + " is now " + status + "."); // Calls method from Dashboard
        }
    }

    public void startCar() {
        if (areWheelsOperational()) {
            engine.start(); // Calls method from contained object (Engine)
            dashboard.displayStatus("Car started.");
            dashboard.showHorsepower(engine.getHorsepower()); // Calls methods from Dashboard and contained Engine
        } else {
            dashboard.displayStatus("Cannot start the car, one or more wheels are flat.");
        }
    }

}
