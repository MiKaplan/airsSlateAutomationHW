package oop;

public class Main {

    public static void main(String[] args) {

        Wheel wheel = new Wheel();
        SportEngine sportEngine = new SportEngine();
        SportDriver sportDriver = new SportDriver();
        LorryDriver lorryDriver = new LorryDriver();

        sportDriver.setName("Misha");
        sportDriver.setLicenseNumber("dsfgvsd");


        SportCar bmw = new SportCar("BMW", "black", sportDriver, 200, 20);
        Lorry lorry1 = new Lorry("Man", "red", lorryDriver, 180, 10);

        bmw.setEngine(sportEngine);
        bmw.setColour("black");
        bmw.setAcceleration(20);
        bmw.setSpeed(300);
        bmw.setDriver(sportDriver);
        bmw.setEngine(sportEngine);
        bmw.setWheel(wheel);


        bmw.startCar();
        bmw.accelerate();
        bmw.accelerate();
        bmw.rotateLeft();
        bmw.rotateRight();
        bmw.brake();
        bmw.stopCar();

        lorry1.startCar();
        lorry1.accelerate();
        lorry1.rotateLeft();
        lorry1.rotateRight();
        lorry1.brake();
        lorry1.stopCar();

        System.out.println(lorry1.getEngine());
        System.out.println(bmw.getEngine());


        System.out.println(bmw.getModel());
    }
}
