package operators;

public class ConvertMinutes {
    public static void main(String[] args) {
        long minutes = 3456789;

        int minutesPerDay = 24 * 60;
        int daysPerYear = 365;

        long minutesPerYear = daysPerYear * minutesPerDay;

        long years = minutes / minutesPerYear;
        long days = (minutes % minutesPerYear) / minutesPerDay;

        System.out.println("В " + minutes + " минутах - " + years + " лет, " + days + " дней");

    }
}
