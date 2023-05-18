package oop;

public class SportCar extends Car{
    private String model = "BMW";

    public SportCar(String model, String colour, Driver driver, double speed, double acceleration) {
        super(model, colour, driver, speed, acceleration);
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }


    @Override
    public void startCar() {
        getDriver().putCarKey();
        getDriver().turnCarKey();
        getEngine().putGas();
        getEngine().burnGas();
        accelerate();
        System.out.println("Sport Car started");
    }

    @Override
    public void accelerate() {
        double speed = getSpeed();
        double acceleration = getAcceleration();
        speed += acceleration;
        System.out.println("Sport Car is accelerating. Current speed: " + speed);
    }

    @Override
    public void rotateLeft() {
        super.rotateLeft();
    }

    @Override
    public void rotateRight() {
        super.rotateRight();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void stopCar() {
        super.stopCar();
    }
}
