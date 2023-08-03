package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        MonthPage monthPage = new MonthPage();

        MonthPage monthPageWithDuplicates = new MonthPage();
        monthPageWithDuplicates.add("September");
        monthPageWithDuplicates.add("February");
        monthPageWithDuplicates.add("November");
        monthPageWithDuplicates.add("July");
        monthPageWithDuplicates.add("October");

        List<List<String>> nestedMonths = Arrays.asList(
                Arrays.asList("December", "January", "February"),
                Arrays.asList("March", "April", "May"),
                Arrays.asList("June", "July", "August"),
                Arrays.asList("September", "October", "November")
        );


        var firstLetters = monthPage.getMonths().stream()
                .map(month -> month.substring(0, 1))
                .collect(Collectors.toList());

        var modifiedMonths = monthPage.getMonths().stream()
                .map(month -> month + "1")
                .collect(Collectors.toList());

        var sortedMonths = monthPage.getMonths().stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        var skipMonths = monthPage.getMonths().stream()
                .skip(3)
                .collect(Collectors.toList());

        var limitMonths = monthPage.getMonths().stream()
                .limit(5)
                .collect(Collectors.toList());

        var monthsWithoutDuplicates = monthPage.getMonths().stream()
                .distinct()
                .collect(Collectors.toList());

        var flatMonths = nestedMonths.stream()
                .flatMap(List::stream)
                .map(month -> month + "2")
                .filter(month -> month.charAt(0) == 'J')
                .collect(Collectors.toList());


        System.out.println(firstLetters);
        System.out.println(modifiedMonths);
        System.out.println(sortedMonths);
        System.out.println(skipMonths);
        System.out.println(limitMonths);
        System.out.println(monthsWithoutDuplicates);
        System.out.println(flatMonths);

    }
}
