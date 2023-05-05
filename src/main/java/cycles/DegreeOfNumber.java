package cycles;

import java.util.Scanner;

public class DegreeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNum = scanner.nextInt();

        int multNum = firstNum;

        for (int i = 1; i < secondNum; i++) {
            firstNum *= multNum;
        }
        System.out.println(firstNum);
    }
}
