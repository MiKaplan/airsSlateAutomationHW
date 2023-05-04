package primitives;

import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar;

        while (true) {
            System.out.println("Введите символ (для выхода введите q):");
            inputChar = scanner.next().charAt(0);

            if (inputChar == 'q') {
                break;
            }

            if (Character.isDigit(inputChar)) {
                System.out.println("Это числовой символ. Его числовое представление: " + (int) inputChar);
            } else if (Character.isUpperCase(inputChar)) {
                System.out.println("Это символ в верхнем регистре. Его числовое представление: " + (int) inputChar);
            } else if (Character.isLowerCase(inputChar)) {
                System.out.println("Это символ в нижнем регистре. Его числовое представление: " + (int) inputChar);
            } else {
                System.out.println("Это другой символ. Его числовое представление: " + (int) inputChar);
            }
        }
    }
}
