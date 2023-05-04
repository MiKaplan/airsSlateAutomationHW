package operators;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int prod = firstNumber * secondNumber;
        double average = (firstNumber + secondNumber) / 2;
        int distance = firstNumber - secondNumber;
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);

        System.out.println("Сумма двох чисел: " + sum +
                "\nРазница двух целых чисел: " + diff +
                "\nПроизведение двух целых чисел: " + prod +
                "\nСреднее из двух целых чисел: " + average +
                "\nРасстояние двух целых чисел: " + distance +
                "\nМаксимальное число: " + max +
                "\nМинимальное число: " +min);
    }
}
