package collections.usage_remove_duplicates;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public void getUniqueNumbers(String input) {
        String[] numbers = input.split(", ");

        Set<String> uniqueNumbers = new HashSet<>();

        for (String number: numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);
    }
}
