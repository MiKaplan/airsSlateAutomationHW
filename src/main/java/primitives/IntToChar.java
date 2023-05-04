package primitives;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputInt;

        while (true) {
            System.out.println("Введите число (для выхода нажмите q): ");
            inputInt = scanner.next();
            if (inputInt.equals("q"))
                break;

            int charNum = parseNumber(inputInt);
            if (charNum != -1) {
                System.out.println("Символ: " + (char)charNum);
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }

    public static int parseNumber(String input) {
        try {
            int num = Integer.parseInt(input);

            if (num >= 0 && num <= 65353) {
                return num;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
        return -1;
    }

}
