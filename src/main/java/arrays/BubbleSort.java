package arrays;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        System.out.println("Неотсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nОтсортированный массив:");
        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
