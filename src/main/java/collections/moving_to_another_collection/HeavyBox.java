package collections.moving_to_another_collection;

public class HeavyBox {

    private int id;
    private int weight;

    public HeavyBox(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "HeavyBox[ID: " + id + ", Weight: " + weight + "]";
    }
}
