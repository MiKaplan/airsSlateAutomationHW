package oop;

public abstract class Engine {

    private String type;
    private double fuelConsumption;
    private int enginePower;

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
//    public Engine(String type, double fuelConsumption) {
//        this.type = type;
//        this.fuelConsumption = fuelConsumption;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void putGas() {
        System.out.println("Gas put");
    }

    public void burnGas() {
        System.out.println("Gas burned");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
