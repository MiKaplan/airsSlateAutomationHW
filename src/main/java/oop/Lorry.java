package oop;

public class Lorry extends SportCar{
    private RegularEngine engine;

    public Lorry(String model, String colour, Wheel wheel, LorryDriver driver, double speed, double acceleration) {
        super(model, colour, wheel, driver, speed, acceleration);
        this.engine = new RegularEngine();
    }

    @Override
    public RegularEngine getEngine() {
        return engine;
    }

    public void setEngine(RegularEngine engine) {
        this.engine = engine;
    }

    @Override
    public void startCar() {
        super.getDriver().putCarKey();
        super.getDriver().turnCarKey();
        engine.putGas();
        engine.burnGas();
        accelerate();
        System.out.println("Lorry started");
    }

    @Override
    public void accelerate() {
        double speed = getSpeed();
        double acceleration = getAcceleration();
        speed += acceleration;
        setSpeed(speed);
        System.out.println("Lorry is accelerating. Current speed: " + speed);
    }

    @Override
    public void brake() {
         setAcceleration(-10);
        System.out.println("Sport Car is slowing down");
    }
}
