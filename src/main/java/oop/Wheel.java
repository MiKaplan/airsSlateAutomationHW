package oop;

public class Wheel {

    private int diameter;
    private String type;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void makeLeftTurn() {
        System.out.println("The wheel turned left");
    }

    public void makeRightTurn() {
        System.out.println("The wheel turned right");
    }
}
