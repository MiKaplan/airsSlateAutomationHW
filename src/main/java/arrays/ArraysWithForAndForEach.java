package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysWithForAndForEach {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Array with for");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Array with foreach");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Array with Iterator");
        Iterator <Integer> iterator = Arrays.stream(numbers).iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
