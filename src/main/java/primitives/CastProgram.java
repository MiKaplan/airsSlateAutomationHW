package primitives;

import java.util.Scanner;

public class CastProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пример приведения типов char -> byte");
        System.out.println("Введите символ: ");

        char inputChar = scanner.next().charAt(0);

        if (inputChar <= Byte.MAX_VALUE) {
            byte byteValue = (byte) inputChar;
            System.out.println("Значение типа byte:" + byteValue + "min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE);
        } else {
            System.out.println("Символ не может быть приведен к типу byte");
        }

        System.out.println("Пример приведения типов float -> char");
        System.out.print("Введите значение типа float: ");

        float inputFloat = scanner.nextFloat();

        if (inputFloat >= Character.MIN_VALUE && inputFloat <= Character.MAX_VALUE) {
            char charFromFloat = (char) inputFloat;
            System.out.println("Значение типа char: " + charFromFloat);
        } else {
            System.out.println("Значение типа float не может быть приведено к типу char");
        }

        System.out.println("Пример приведения типов float -> char -> int");
        System.out.print("Введите значение типа float: ");
        inputFloat = scanner.nextFloat();
        if (inputFloat >= Character.MIN_VALUE && inputFloat <= Character.MAX_VALUE) {
            char charFromFloat = (char) inputFloat;
            int intFromChar = charFromFloat;
            System.out.println("Значение типа int: " + intFromChar);
        } else {
            System.out.println("Значение типа float не может быть приведено к типу int");
        }
    }
}
