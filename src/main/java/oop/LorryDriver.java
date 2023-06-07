package oop;

public class LorryDriver extends SportDriver{

    @Override
    public void putCarKey() {
        System.out.println("Sport Driver, Key put");
    }

    @Override
    public void turnCarKey() {
        System.out.println("Sport Driver, Key turned");
    }
}
