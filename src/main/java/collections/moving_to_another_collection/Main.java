package collections.moving_to_another_collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(1, 200));
        boxes.add(new HeavyBox(2, 400));
        boxes.add(new HeavyBox(3, 500));

        List<HeavyBox> heavyBoxes = new ArrayList<>();

        for (HeavyBox box : boxes) {
            if (box.getWeight() > 300) {
                heavyBoxes.add(box);
            }
        }

        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println("HeavyBox: " + heavyBox);
        }
    }
}
