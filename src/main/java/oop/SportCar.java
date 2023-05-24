package oop;

public class SportCar implements Car{
    private String model;
    private String colour;
    private Engine engine;
    private Wheel wheel;
    private SportDriver driver;
    private double speed;
    private double acceleration;

    public SportCar(String model, String colour, Wheel wheel, SportDriver driver, double speed, double acceleration) {
        this.model = model;
        this.colour = colour;
        this.engine = new SportEngine();
        this.wheel = wheel;
        this.driver = driver;
        this.speed = speed;
        this.acceleration = acceleration;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

    public void setDriver(SportDriver driver) {
        this.driver = driver;
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

    @Override
    public void startCar() {
        driver.putCarKey();
        driver.turnCarKey();
        engine.putGas();
        engine.burnGas();
        accelerate();
        System.out.println("Sport Car started");
    }

    @Override
    public void accelerate() {
        speed += acceleration;
        System.out.println("Sport Car is accelerating. Current speed: " + speed);
    }



    @Override
    public void brake() {
        this.acceleration = -10;
        System.out.println("Sport Car is slowing down");
    }

    @Override
    public void stopCar() {
        this.acceleration = -10;
        engine.stopEngine();
    }
}
