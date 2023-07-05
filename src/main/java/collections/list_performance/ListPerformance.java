package collections.list_performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformance {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        long startTime = System.nanoTime();
        addElements(arrayList, 5000);
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;


        startTime = System.nanoTime();
        addElements(linkedList, 5000);
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;


        startTime = System.nanoTime();
        selectRandomElements(arrayList, 5000);
        endTime = System.nanoTime();
        long arrayListSelectTime = endTime - startTime;


        startTime = System.nanoTime();
        selectRandomElements(linkedList, 5000);
        endTime = System.nanoTime();
        long linkedListSelectTime = endTime - startTime;


        System.out.println("Время добавления элементов в ArrayList: " + arrayListAddTime + " нс");
        System.out.println("Время добавления элементов в LinkedList: " + linkedListAddTime + " нс");
        System.out.println("Время выбора элементов наугад из ArrayList: " + arrayListSelectTime + " нс");
        System.out.println("Время выбора элементов наугад из LinkedList: " + linkedListSelectTime + " нс");
    }

    private static void addElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    private static void selectRandomElements(List<Integer> list, int count) {
        Random random = new Random();
        int size = list.size();

        for (int i = 0; i < count; i++) {
            int index = random.nextInt(size);
            list.get(index);
        }
    }
}
