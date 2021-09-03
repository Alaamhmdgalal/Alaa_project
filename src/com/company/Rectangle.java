package com.company;

public class Rectangle extends Shape{
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>=0)
        this.length = length;
        else
            System.out.println("Invalid length");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>=0)
        this.width = width;
        else
            System.out.println("Invalid width");
    }
}