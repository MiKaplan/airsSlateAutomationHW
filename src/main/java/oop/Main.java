package oop;

public class Main {

    public static void main(String[] args) {
        Engine engine = new SportEngine("V", 15);
        Wheel wheel = new Wheel(15, "sport");
        Driver driver = new Driver("Misha", 8, "fsd234");

        Car car = new Car("BMW", "red", engine, wheel, driver, 200, 12);

        car.startCar();
        car.accelerate();
        car.accelerate();
        car.rotateLeft();
        car.rotateRight();
        car.brake();
        car.stopCar();
    }
}
