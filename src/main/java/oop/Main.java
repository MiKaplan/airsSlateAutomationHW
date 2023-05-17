package oop;

public class Main {

    public static void main(String[] args) {
//        Engine engine = new SportEngine("V", 15);
        Wheel wheel = new Wheel(15, "sport");
//        Driver driver = new Driver("Misha", 8, "fsd234");

        Engine engine = new SportEngine();

        Driver driver = new SportDriver();
        driver.setName("Misha");
        driver.setLicenseNumber("dsfgvsd");

//        Car bmw = new Car("BMW", "red", engine, wheel, driver, 200, 12);

        Car bmw = new SportCar();

        bmw.setColour("black");
        bmw.setAcceleration(20);
        bmw.setSpeed(300);
        bmw.setDriver(driver);
        bmw.setEngine(engine);
        bmw.setWheel(wheel);


        bmw.startCar();
        bmw.accelerate();
        bmw.accelerate();
        bmw.rotateLeft();
        bmw.rotateRight();
        bmw.brake();
        bmw.stopCar();

        System.out.println(bmw.getModel());
    }
}
