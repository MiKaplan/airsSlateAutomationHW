package oop;

public class SportEngine extends Engine {

//    public SportEngine(String type, double fuelConsumption) {
//        super(type, fuelConsumption);
//    }

    private final int enginePower = 250;

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
