package com.app.vp.chapter_8_SOLID.other_principles.law_of_Demetry;

public class Engine {

    private int horsepower;
    private boolean isRunning;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
        this.isRunning = false;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void start() {
        this.isRunning = true;
    }

    public void stop() {
        this.isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }


}
