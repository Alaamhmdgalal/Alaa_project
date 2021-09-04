package task4.shapePackage;

public interface Shape {
    public String color = null;
    public String name = null;
    public boolean isFilled = false;

    public abstract double getArea();
    public abstract String getShapeName();
}
