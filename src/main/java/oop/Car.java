package oop;

public class Car {

    private String model;
    private String colour;
    private Engine engine;
    private Wheel wheel;
    private Driver driver;
    private double speed;
    private double acceleration;

    public Car(String model, String colour, Engine engine, Wheel wheel, Driver driver, double speed, double acceleration) {
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.wheel = wheel;
        this.driver = driver;
        this.speed = 0;
        this.acceleration = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void startCar() {
        driver.putCarKey();
        driver.turnCarKey();
        engine.putGas();
        engine.burnGas();
        this.acceleration = 10;
        System.out.println("Car started");
    }

    public void accelerate() {
        this.speed += this.acceleration;
        System.out.println("Car is accelerating. Current speed: " + this.speed);
    }


    public void rotateLeft() {
        wheel.makeLeftTurn();
        System.out.println("The car turned left");
    }

    public void rotateRight() {
        wheel.makeRightTurn();
        System.out.println("The car turned right");
    }

    public void brake() {
        this.acceleration = -10;
        System.out.println("Car is slowing down");
    }

    public void stopCar() {
        this.acceleration = -10;
        engine.stopEngine();
    }


}
