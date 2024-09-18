package com.app.vp.chapter_8_SOLID.OCP;

public class Square extends Shape{

    @Override
    void draw() {
        System.out.println("Square");
        System.out.println("_______");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("_______");
    }
}
