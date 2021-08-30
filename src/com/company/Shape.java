package com.company;

public class Shape {
    protected String color;
    protected String name;
    protected boolean isFilled;

    public Shape(){}

    public Shape(String color, String name, boolean isFilled) {
        this.color = color;
        this.name=name;
        this.isFilled=isFilled;
    }

    public double getArea(){
        return 0;
    }
}
