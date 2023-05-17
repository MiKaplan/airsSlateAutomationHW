package oop;

public class SportCar extends Car{
    private String model = "BMW";

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
        driver.putCarKey();
        driver.turnCarKey();
        engine.putGas();
        engine.burnGas();
        acceleration = 10;
        System.out.println("Sport Car started");
    }

    @Override
    public void accelerate() {
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
