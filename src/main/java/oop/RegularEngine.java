package oop;

public class RegularEngine extends SportEngine{

    @Override
    public void putGas() {
        System.out.println("Regular Engine, Gas put");
    }

    @Override
    public void burnGas() {
        System.out.println("Regular Engine, Gas burned");
    }

    @Override
    public void stopEngine() {
        System.out.println("Regular Engine stopped");
    }

}
