package cycles;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();

        int firstNum = 0; int secondNum = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println(firstNum);

            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
