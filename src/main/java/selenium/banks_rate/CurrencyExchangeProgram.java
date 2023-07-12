package selenium.banks_rate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.Elem;
import selenium.WebDriverConfig;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchangeProgram {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getInstance();

        List<String> bankUrls = new ArrayList<>();
        bankUrls.add("https://next.privat24.ua/");
        bankUrls.add("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        bankUrls.add("https://www.universalbank.com.ua/");
        bankUrls.add("http://www.oschadbank.ua/ua/");

        List<Double> purchaseRates = new ArrayList<>();
        List<Double> saleRates = new ArrayList<>();

        for (String url : bankUrls) {
            driver.get(url);

            if (url.equals("https://next.privat24.ua/")) {
                Elem purchaseRateElem = new Elem(driver, By.cssSelector("div[class^=\"rates\"] span:nth-last-child(2)"));
                Elem saleRateElem = new Elem(driver, By.cssSelector("div[class^=\"rates\"] span:nth-last-child(2)"));

                double purchaseRate = Double.parseDouble(purchaseRateElem.getText());
                double saleRate = Double.parseDouble(saleRateElem.getText());

                purchaseRates.add(purchaseRate);
                saleRates.add(saleRate);
            }

            if (url.equals("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/")) {
                Elem purchaseRateElem = new Elem(driver, By.cssSelector("ul[class=\"exchange__wrap\"] li:first-child div[class=\"exchange__item-value\"]:nth-child(2)"));
                Elem saleRateElem = new Elem(driver, By.cssSelector("ul[class=\"exchange__wrap\"] li:first-child div[class=\"exchange__item-value\"]:nth-child(3)"));

                double purchaseRate = Double.parseDouble(purchaseRateElem.getText().replace(',', '.'));
                double saleRate = Double.parseDouble(saleRateElem.getText().replace(',', '.'));

                purchaseRates.add(purchaseRate);
                saleRates.add(saleRate);
            }

            if (url.equals("https://www.universalbank.com.ua/")) {
                Elem purchaseRateElem = new Elem(driver, By.cssSelector("table[class^=\"rate table\"] tr:nth-child(2) td:nth-child(2)"));
                Elem saleRateElem = new Elem(driver, By.cssSelector("table[class^=\"rate table\"] tr:nth-child(2) td:nth-child(3)"));

                double purchaseRate = Double.parseDouble(purchaseRateElem.getText());
                double saleRate = Double.parseDouble(saleRateElem.getText());

                purchaseRates.add(purchaseRate);
                saleRates.add(saleRate);
            }

            if (url.equals("http://www.oschadbank.ua/ua/")) {
                Elem purchaseRateElem = new Elem(driver, By.cssSelector("a[class=\"currency header__currency\"] div:first-child span[class=\"currency__item_value\"]:nth-child(2)"));
                Elem saleRateElem = new Elem(driver, By.cssSelector("a[class=\"currency header__currency\"] div:first-child span[class=\"currency__item_value\"]:nth-child(3)"));

                double purchaseRate = Double.parseDouble(purchaseRateElem.getText());
                double saleRate = Double.parseDouble(saleRateElem.getText());

                purchaseRates.add(purchaseRate);
                saleRates.add(saleRate);
            }
        }

        double averagePurchaseRate = calculateAverage(purchaseRates);
        double averageSaleRate = calculateAverage(saleRates);

        System.out.println("Average purchase rate: " + averagePurchaseRate);
        System.out.println("Average sale rate: " + averageSaleRate);

        int lowestPurchaseRateIndex = findLowestRateIndex(purchaseRates);
        int highestSaleRateIndex = findHighestRateIndex(saleRates);

        System.out.println("The bank with the lowest dollar purchase rate: " + bankUrls.get(lowestPurchaseRateIndex));
        System.out.println("The bank with the highest dollar sale rate: " + bankUrls.get(highestSaleRateIndex));


        driver.quit();

    }

    private static double calculateAverage(List<Double> rates) {
        double sum = 0.0;
        for (double rate : rates) {
            sum += rate;
        }
        return sum / rates.size();
    }

    private static int findLowestRateIndex(List<Double> rates) {
        int lowestIndex = 0;
        for (int i = 1; i < rates.size(); i++) {
            if (rates.get(i) < rates.get(lowestIndex)) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    private static int findHighestRateIndex(List<Double> rates) {
        int highestIndex = 0;
        for (int i = 1; i < rates.size(); i++) {
            if (rates.get(i) > rates.get(highestIndex)) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }
}
