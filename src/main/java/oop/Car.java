package oop;

public abstract class Car {

    private String model;
    private String colour;
    protected static Engine engine;
    private Wheel wheel;
    protected static Driver driver;
    protected static double speed;
    protected static double acceleration;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        Car.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        Car.driver = driver;
    }


//    public Car(String model, String colour, Engine engine, Wheel wheel, Driver driver, double speed, double acceleration) {
//        this.model = model;
//        this.colour = colour;
//        this.engine = engine;
//        this.wheel = wheel;
//        this.driver = driver;
//        this.speed = 0;
//        this.acceleration = 0;
//    }

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
        Car.speed = speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        Car.acceleration = acceleration;
    }

    public void startCar() {
        driver.putCarKey();
        driver.turnCarKey();
        engine.putGas();
        engine.burnGas();
        acceleration = 10;
        System.out.println("Car started");
    }

    public void accelerate() {
        Car.speed += Car.acceleration;
        System.out.println("Car is accelerating. Current speed: " + Car.speed);
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
        Car.acceleration = -10;
        System.out.println("Car is slowing down");
    }

    public void stopCar() {
        Car.acceleration = -10;
        engine.stopEngine();
    }


}
