package selenium.banks_rate.helper;

import java.util.List;

public class BanksCalculateMethods {



    public static void calculateAverage(List<Double> rates) {
        double sum = 0.0;
        for (double rate : rates) {
            sum += rate;
        }
        System.out.println("Average purchase rate: " + sum / rates.size());
    }

    public static void findLowestRateIndex(List<String> names, List<Double> rates) {
        int lowestIndex = 0;
        for (int i = 1; i < rates.size(); i++) {
            if (rates.get(i) < rates.get(lowestIndex)) {
                lowestIndex = i;
            }
        }
        System.out.println("The bank with the lowest dollar purchase rate: " + getBankName(names, lowestIndex));
    }

    public static void findHighestRateIndex(List<String> names, List<Double> rates) {
        int highestIndex = 0;
        for (int i = 1; i < rates.size(); i++) {
            if (rates.get(i) > rates.get(highestIndex)) {
                highestIndex = i;
            }
        }
        System.out.println("The bank with the highest dollar sale rate: " + getBankName(names, highestIndex));
    }

    public static String getBankName(List<String> bankNames, int index) {
        return bankNames.get(index);
    }
}
