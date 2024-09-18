package com.app.vp.chapter_8_SOLID.OCP;

public class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Rectangle");
        System.out.println("   /|");
        System.out.println("  / |");
        System.out.println(" /  |");
        System.out.println("/   |");
        System.out.println("-----");
    }
}
