package com.app.vp.chapter_8_SOLID.other_principles.composition_better_than_inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a car with a gasoline engine
        Car myCar = new Car(new GasolineEngine());
        myCar.start(); // Output: Car is started
        //Gasoline engine starting...

        // Changing the engine to an electric engine at runtime
        myCar.setEngine(new ElectricEngine());
        myCar.start(); // Output: Car is Electric engine starting...
    }
}

/**
 * Benefits of Composition:
 * Flexibility: You can change the behavior of Car at runtime by changing the engine.
 * No rigid inheritance hierarchy: This avoids the limitations of inheritance and allows for more modular and reusable code.
 * Encapsulation: The Car class does not need to know about the specifics of the engines; it simply relies on the Engine interface.
 * */
