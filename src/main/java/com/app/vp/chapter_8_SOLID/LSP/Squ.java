package com.app.vp.chapter_8_SOLID.LSP;

public class Squ extends Shape{

    @Override
    public int width() {
        return 5;
    }

    @Override
    public int height() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Squ: %s, %s", width(), height());
    }
}
