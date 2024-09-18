package com.app.vp.chapter_8_SOLID.other_principles.composition_better_than_inheritance;

public class GasolineEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Gasoline engine starting...");
    }
}
