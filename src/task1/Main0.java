package task1;

import task4.carPackage.Bmw;
import task4.carPackage.Car;
import task4.carPackage.Mercedes;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        System.out.println("1)X3 M" + "\n2)Sedan 330I0" + "\n3)GLA250" + "\n4)SL 600");
        System.out.println("Choose which one you want to check its fuel type: ");
        choose = scan.nextInt();

            if (choose == 1) {
                task4.carPackage.Bmw X3 = new task4.carPackage.Bmw("X3 M", "Hatchback", "Petrol", "473.38 hp @ 6250 rpm", 250);
                System.out.println(X3.getFuelType(X3.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    X3.printData();
                } else
                    System.out.println("Thank you!");

            } else if (choose == 2) {
                task4.carPackage.Bmw Sedan = new Bmw("330I", "Hatchback", "Petrol", "452.38 hp @ 6250 rpm", 230);
                System.out.println(Sedan.getFuelType(Sedan.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    Sedan.printData();
                } else
                    System.out.println("Thank you!");

            } else if (choose == 3) {
                task4.carPackage.Mercedes GLA = new task4.carPackage.Mercedes("GLA250", "Hatchback", "Electrical", "221 hp @ 5500 rpm",
                        230);
                System.out.println(GLA.getFuelType(GLA.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    GLA.printData();
                } else
                    System.out.println("Thank you!");
            } else if (choose == 4) {
                task4.carPackage.Mercedes SL = new Mercedes("SL 600", "Cabriolet", "Electrical ", "305 hp @ 5550 rpm", 250);
                System.out.println(SL.getFuelType(SL.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    SL.printData();
                } else
                    System.out.println("Thank you!");
            }
    }
}