package com.app.vp.chapter_8_SOLID.OCP;

public class GraphicEditor {

    public static void drawShape(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {

        //if drawing rectangle:
        Shape rect = new Rectangle();

        //invoke graphic editor method drawShape:
        drawShape(rect);

        //if drawing rectangle:
        Shape square = new Square();

        //invoke graphic editor method drawShape:
        drawShape(square);

    }
}
