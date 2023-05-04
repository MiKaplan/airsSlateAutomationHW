package cycles;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
