package collections.add_and_remove_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<HeavyBox> queue = new ArrayDeque<>();

        queue.offer(new HeavyBox(1, 10));
        queue.offer(new HeavyBox(2, 20));
        queue.offer(new HeavyBox(3, 30));
        queue.offer(new HeavyBox(4, 30));

        while (!queue.isEmpty()) {
            HeavyBox removedBox = queue.poll();
            System.out.println("Remove object:" + removedBox);
        }
    }
}
