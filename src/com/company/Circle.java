package com.company;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, String name, boolean isFilled, double radius){
        super(color, name,isFilled);
        this.radius=radius;
    }
    @Override
    public void getArea(){
    System.out.println(3.14*radius*radius);
    }
}
