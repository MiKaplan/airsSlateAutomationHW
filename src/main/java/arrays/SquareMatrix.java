package arrays;

import java.util.Random;
import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер квадратной матрицы:");
        int num = scanner.nextInt();

        int[][] array = new int[num][num];
        Random random = new Random();

        System.out.println("Пример квадратной матрицы:");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sumLeft = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    sumLeft += array[i][j];
                }
            }
        }
        System.out.println("Сумма по левой диагонали - " + sumLeft);

        int sumRight = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == num - 1 - j) {
                    sumRight += array[i][j];
                }
            }
        }
        System.out.println("Сумма по правой диагонали - " + sumRight);

        System.out.println("Транспортированная матрица:");
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }





    }
}
