package arrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int userNumber = scanner.nextInt();
        int temp = userNumber;

        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = userNumber % 10;
            userNumber /= 10;
        }

        boolean isPalindrome = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Число " + userNumber + " - полиндром");
        } else {
            System.out.println("Число " + userNumber + " - не полиндром");
        }
    }
}
