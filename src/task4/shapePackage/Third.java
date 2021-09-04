package task4.shapePackage;

public class Third {
    public static void main(String ars[]){
        Circle c1 = new Circle();
    c1.setRadius(2);
    displayShape(c1);

    Square s1 = new Square();
    s1.setSide(-3);
    displayShape(s1);

    Rectangle r1 = new Rectangle();
    r1.setWidth(2);
    r1.setLength(3);
    displayShape(r1);
    }

    public static void displayShape(Shape shape1){
        System.out.println("Shape name: " + shape1.getShapeName());
        System.out.println("Shape area: " + shape1.getArea());
    }
}
