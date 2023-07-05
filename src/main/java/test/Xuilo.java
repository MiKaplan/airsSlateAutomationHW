package test;

public abstract class Xuilo {

    private final int distance;

    public Xuilo(int distance) {
        this.distance = distance;
    }

    public int getDifferentDistance(final Xuilo xuilo) {
        return this.distance - xuilo.distance;
    }
}