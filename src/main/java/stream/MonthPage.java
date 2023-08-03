package stream;

import java.util.ArrayList;
import java.util.List;

public class MonthPage {
    private final List<String> months = new ArrayList<>();

    public MonthPage() {
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public List<String> getMonths() {
        return months;
    }

    public void add(String month) {
        months.add(month);
    }

}
