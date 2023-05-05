package cycles;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввеите высоту пирамиды:");
        int height = scanner.nextInt();

        System.out.println("pyramid #1");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("pyramid #2");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("pyramid #3");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = height - i; k < height; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("pyramid #4");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("pyramid #5");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("pyramid #6");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print(Math.abs(i - k) + 1);
            }
            System.out.println();
        }
    }
}
