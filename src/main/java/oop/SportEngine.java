package oop;

public class SportEngine implements Engine {

    private String type;
    private double fuelConsumption;
    private int enginePower;

    @Override
    public void putGas() {
        System.out.println("Sport Engine, Gas put");
    }

    @Override
    public void burnGas() {
        System.out.println("Sport Engine, Gas burned");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sport Engine stopped");
    }
}
