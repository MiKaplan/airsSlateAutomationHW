package oop;

public class SportEngine implements Engine {

    @Override
    public void putGas() {
        System.out.println("Sport Engine, Gas put");
    }

    @Override
    public void burnGas() {
        System.out.println("Sport Engine, Gas burned");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sport Engine stopped");
    }
}
