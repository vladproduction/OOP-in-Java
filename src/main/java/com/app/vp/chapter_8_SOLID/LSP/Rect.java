package com.app.vp.chapter_8_SOLID.LSP;

public class Rect extends Shape{

    @Override
    public int width() {
        return 5;
    }

    @Override
    public int height() {
        return 6;
    }

    @Override
    public String toString() {
        return String.format("Rect: %s, %s", width(), height());
    }
}
