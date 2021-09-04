package task4.carPackage;

public abstract class Car {
    private String model;
    private String design;
    private String fuel;
    private String maxPower;
    private int maxSpeed;
    private static int counter;


    public Car(String model, String design, String fuel, String maxPower, int maxSpeed){
        this.model=model;
        this.design=design;
        this.fuel=fuel;
        this.maxPower=maxPower;
        this.maxSpeed=maxSpeed;
        counter++;
    }

    public String getModel() {
        return model;
    }

    public String getDesign() {
        return design;
    }

    public String getFuel() {
        return fuel;
    }

    public String getMaxPower() {
        return maxPower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxPower(String maxPower) {
        this.maxPower = maxPower;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setFuelType(String fuel) {
        this.fuel = fuel;
    }

    public abstract String getFuelType(String fuelType);

    public void printData(){
        System.out.println("Model: " + model + "\nDesign: " + design + "\nFuel type: " +
                fuel + "\nMax power: " + maxPower + "\nMax speed: " + maxSpeed);
    }

    public static int getCounter() {
        return counter;
    }
}
