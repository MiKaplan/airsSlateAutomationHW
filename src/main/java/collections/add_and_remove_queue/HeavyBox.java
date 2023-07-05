package collections.add_and_remove_queue;

public class HeavyBox {
    private final int id;
    private final int weight;

    public HeavyBox(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public String toString() {
        return "HeavyBox[ID: " + id + ", Weight: " + weight + "]";
    }
}
