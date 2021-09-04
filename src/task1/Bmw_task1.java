package task1;

public class Bmw_task1 extends Car_task1 {


    public Bmw_task1(String model, String fuel){
        super(model,fuel);
    }

    public Bmw_task1(String model, String design, String fuel){
        super(model, design, fuel);
    }

    public Bmw_task1(String model, String design, String fuel, String maxPower) {
        super(model, design, fuel, maxPower);
    }

    public Bmw_task1(String model, String design, String fuel, String maxPower, int maxSpeed) {
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
