package com.carPackage;

public class Bmw extends Car{

    public Bmw(String model){
        super(model);
    }

    public Bmw(String model, String fuel){
        super(model,fuel);
    }

    public Bmw(String model, String design, String fuel){
        super(model, design, fuel);
    }

    public Bmw(String model, String design, String fuel, String maxPower) {
        super(model, design, fuel, maxPower);
    }

    public Bmw(String model, String design, String fuel, String maxPower, int maxSpeed) {
        super(model, design, fuel, maxPower, maxSpeed);
    }


    @Override
    public String getFuelType(String model){
        if(model.equals("X3 M") || model.equals("330I"))
            return "Petrol";
        else
            return "Anything else";
    }

}
