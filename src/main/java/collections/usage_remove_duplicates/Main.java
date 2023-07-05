package collections.usage_remove_duplicates;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a set of numbers: ");

        String input = scanner.nextLine();

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        removeDuplicates.getUniqueNumbers(input);
    }
}
