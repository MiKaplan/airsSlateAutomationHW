package oop;

public class Lorry extends Car{

    public Lorry(String model, String colour, Driver driver, double speed, double acceleration) {
        super(model, colour, driver, speed, acceleration);
    }

    @Override
    public void startCar() {
        getDriver().putCarKey();
        getDriver().turnCarKey();
        getEngine().putGas();
        getEngine().burnGas();
        accelerate();
        System.out.println("Lorry started");
    }

    @Override
    public void accelerate() {
        double speed = getSpeed();
        double acceleration = getAcceleration();
        speed += acceleration;
        System.out.println("Lorry is accelerating. Current speed: " + speed);
    }
}
