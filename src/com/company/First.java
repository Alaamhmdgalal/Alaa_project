package com.company;

class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Ali";
        p2.name = "Ahmed";
        p1.job = "Engineer";
        p2.age = 25;
        p1.jobInfo();
        p2.run();

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