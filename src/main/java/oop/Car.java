package oop;

public interface Car {

    Wheel wheel = new Wheel();

    void startCar();
    void accelerate();
    void brake();
    void stopCar();


    default void rotateLeft() {
        wheel.makeLeftTurn();
        System.out.println("The car turned left");
    }

    default void rotateRight() {
        wheel.makeRightTurn();
        System.out.println("The car turned right");
    }


}
