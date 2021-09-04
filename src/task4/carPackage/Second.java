package task4.carPackage;
import java.util.*;

public class Second {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choose;

        do {
            System.out.println();
            System.out.println("1)X3 M" + "\n2)Sedan 330I0" + "\n3)GLA250" + "\n4)SL 600");
            System.out.println("Choose which one you want to check its fuel type (enter 0 if you don't want): ");
            choose = scan.nextInt();
            if (choose == 1) {
                Bmw X3 = new Bmw("X3 M", "Hatchback", "Petrol", "473.38 hp @ 6250 rpm", 250);
                System.out.println(X3.getFuelType(X3.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    X3.printData();
                } else
                    System.out.println("Thank you!");

            } else if (choose == 2) {
                Bmw Sedan = new Bmw("330I", "Hatchback", "Petrol", "452.38 hp @ 6250 rpm", 230);
                System.out.println(Sedan.getFuelType(Sedan.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    Sedan.printData();
                } else
                    System.out.println("Thank you!");

            } else if (choose == 3) {
                Mercedes GLA = new Mercedes("GLA250", "Hatchback", "Electrical", "221 hp @ 5500 rpm",
                        230);
                System.out.println(GLA.getFuelType(GLA.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    GLA.printData();
                } else
                    System.out.println("Thank you!");
            } else if (choose == 4){
                Mercedes SL = new Mercedes("SL 600", "Cabriolet", "Electrical ", "305 hp @ 5550 rpm", 250);
                System.out.println(SL.getFuelType(SL.getModel()));
                System.out.println("Do you want to print all data? (Type yes if you want)");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("yes")) {
                    SL.printData();
                } else
                    System.out.println("Thank you!");
            }

        }while(choose != 0);
        System.out.println("Number of objects created: " + Car.getCounter());
    }
}
