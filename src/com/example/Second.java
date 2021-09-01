package com.example;

import java.util.Scanner;

public class Second {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Bmw X3 = new Bmw("X3 M", "Hatchback", "Petrol", "473.38 hp @ 6250 rpm", 250);
        Bmw Sedan = new Bmw("330I", "Petrol");
        Mercedes GLA = new Mercedes("GLA250", "Hatchback", "Premium unleaded", "221 hp @ 5500 rpm",
                230);
        Mercedes SL = new Mercedes("SL 600", "Cabriolet", "Premium unleaded");


        System.out.println("1)X3 M" + "\n2)Sedan 330I0" + "\n3)GLA250" + "\n4)SL 600");
        System.out.println("Choose which type you want to check its fuel type: ");
        int choose = scan.nextInt();

        if(choose == 1) {
            System.out.println(X3.getFuelType(X3.getModel()));
            System.out.println("Do you want to print all data? (Type yes if you want)");
            String yesOrNo = scan.next();
            if(yesOrNo.equals("yes")) {
                X3.printData();
            }else
                System.out.println("Thank you!");

        }else if (choose == 2) {
            System.out.println(Sedan.getFuelType(Sedan.getModel()));
            System.out.println("Do you want to print all data? (Type yes if you want)");
            String yesOrNo = scan.next();
            if(yesOrNo.equals("yes")) {
                Sedan.printData();
            }else
                System.out.println("Thank you!");

        }else if (choose == 3) {
            System.out.println(GLA.getFuelType(GLA.getModel()));
            System.out.println("Do you want to print all data? (Type yes if you want)");
            String yesOrNo = scan.next();
            if(yesOrNo.equals("yes")) {
                GLA.printData();
            }else
                System.out.println("Thank you!");
        }else {
            System.out.println(SL.getFuelType(SL.getModel()));
            System.out.println("Do you want to print all data? (Type yes if you want)");
            String yesOrNo = scan.next();
            if(yesOrNo.equals("yes")) {
                SL.printData();
            }else
                System.out.println("Thank you!");

        }
    }

}
