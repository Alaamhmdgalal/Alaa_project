package task4.shapePackage;

public class Circle implements Shape{
    private double radius;


    @Override
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String getShapeName(){
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2*(Math.PI)*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0)
        this.radius = radius;
        else
            System.out.println("Invalid radius");
    }
}
