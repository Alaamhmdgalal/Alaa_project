package com.carPackage;

public class Mercedes extends Car{

    public Mercedes(String model){
        super(model);
    }

    public Mercedes(String model, String fuel){
        super(model,fuel);
    }

    public Mercedes(String model, String design, String fuel){
        super(model, design, fuel);
    }

    public Mercedes(String model, String design, String fuel, String maxPower) {
        super(model, design, fuel, maxPower);
    }

    public Mercedes(String model, String design, String fuel, String maxPower, int maxSpeed) {
        super(model, design, fuel, maxPower, maxSpeed);
    }

    @Override
    public String getFuelType(String model){
        if(model.equals("GLA250") || model.equals("SL 600"))
            return "Electrical";
        else
            return "Anything else";
    }
}
