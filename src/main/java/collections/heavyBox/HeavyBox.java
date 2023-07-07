package collections.heavyBox;

public class HeavyBox implements Comparable<HeavyBox>{

    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public int compareTo(HeavyBox otherBox) {
        return Integer.compare(this.weight, otherBox.getWeight());
    }
}
