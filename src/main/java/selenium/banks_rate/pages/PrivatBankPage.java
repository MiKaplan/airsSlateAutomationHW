package selenium.banks_rate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import selenium.Elem;

public class PrivatBankPage extends BasePage {

    private final String URL = "https://next.privat24.ua/";
    private final String NAME = "Privat Bank";

    private final Logger logger = LogManager.getLogger(PrivatBankPage.class);
    Elem purchaseRateElem = new Elem(getDriver(), By.cssSelector("div[class^=\"rates\"] span:nth-last-child(2)"));
    Elem saleRateElem = new Elem(getDriver(), By.cssSelector("div[class^=\"rates\"] span:nth-last-child(2)"));
    Elem mainElem= new Elem(getDriver(), By.cssSelector("a[title=\"Головна\"]"));


    @Override
    public boolean isLoaded() {
        logger.info("Page " + URL + " is loaded");
        return mainElem.isDisplayed();
    }

    @Override
    public void openURL() {
        logger.info("Page "+ URL + " open");
        getDriver().get(URL);
    }

    @Override
    public Double getPurchaseRateElemText() {
        return Double.parseDouble(purchaseRateElem.getText());
    }
    @Override
    public Double getSaleRateElemText() {
        return Double.parseDouble(saleRateElem.getText());
    }

    @Override
    public String getBankName() {
        return NAME;
    }


}
