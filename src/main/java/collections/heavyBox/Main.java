package collections.heavyBox;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<HeavyBox> boxes = new TreeSet<>();
        boxes.add(new HeavyBox(10));
        boxes.add(new HeavyBox(5));
        boxes.add(new HeavyBox(5));
        boxes.add(new HeavyBox(7));
        boxes.add(new HeavyBox(17));

        for (HeavyBox box : boxes) {
            System.out.println(box.getWeight());
        }
    }
}
