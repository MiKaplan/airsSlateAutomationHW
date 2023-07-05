package collections.remove_dublicates;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<String> words = new ArrayList<>();

        words.add("test1");
        words.add("test2");
        words.add("test1");
        words.add("test3");

        Collection<String> uniqueWords = DuplicateRemover.removeDuplicates(words);
        System.out.println(uniqueWords);
    }
}
