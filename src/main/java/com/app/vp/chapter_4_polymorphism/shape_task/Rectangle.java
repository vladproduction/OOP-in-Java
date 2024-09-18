package com.app.vp.chapter_4_polymorphism.shape_task;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length + "}" + super.toString();
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return (width * 2) + (length * 2);
    }
}
