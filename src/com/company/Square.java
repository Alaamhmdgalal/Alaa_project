package com.company;

public class Square extends Shape{
    private double side;


    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>=0)
        this.side = side;
        else
            System.out.println("Invalid side");
    }
}
