package com;
import java.util.Scanner;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sum = 0.0;

        ArrayList<Double> listOfNumbers = new ArrayList<>();

        System.out.println("Enter the size of your array: ");
        int input = scan.nextInt();
        for (int i = 0; i < input; i++){
            listOfNumbers.add(scan.nextDouble());
            sum+= listOfNumbers.get(i);
        }

    double average = sum / listOfNumbers.size();
    System.out.println(average);



    /*double[] arrayOfNumbers = new double[10];
        for(int i = 0 ; i < arrayOfNumbers.length ; i++){
         arrayOfNumbers[i]= scan.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0 ; i < arrayOfNumbers.length ; i++){
            sum+=arrayOfNumbers[i];
        }
        double average = sum/arrayOfNumbers.length;
        System.out.println(average);
    */



        /*Circle c1 = new Circle();
    c1.setRadius(2);
    System.out.println("Circle area: " + c1.getArea());

    Square s1 = new Square();
    s1.setSide(-3);
    System.out.println("Square area: " + s1.getArea());

    Rectangle r1 = new Rectangle();
    r1.setWidth(2);
    r1.setLength(3);
    System.out.println("Rectangle perimeter: " + r1.getPerimeter());

     */


        //Person p1 = new Person();
        //Person p2 = new Person();
        //p1.name = "Ali";
        //p2.name = "Ahmed";
        //p1.job = "Engineer";
        //p2.age = 25;
        //p1.jobInfo();
        //p2.run();


        //int result = multiplyTwoNumber(2,3);
        //if (result >= 0)
        //    System.out.println("The number is positive");
        //else
        //    System.out.println("The number is negative");
        //}

        //public static int multiplyTwoNumber(int number1, int number2){
        //    return number1*number2;
        //}

    }
}