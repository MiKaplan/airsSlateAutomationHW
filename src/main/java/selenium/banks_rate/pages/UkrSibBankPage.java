package selenium.banks_rate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import selenium.Elem;
import selenium.utils.WebElementNotFoundException;

public class UkrSibBankPage extends BasePage{

    private final String URL = "https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/";
    private final String NAME = "Ukr Sib Bank";
    private final Logger logger = LogManager.getLogger(UkrSibBankPage.class);
    Elem purchaseRateElem = new Elem(getDriver(), By.cssSelector("ul[class=\"exchange__wrap\"] li:first-child div[class=\"exchange__item-value\"]:nth-child(2)"));
    Elem saleRateElem = new Elem(getDriver(), By.cssSelector("ul[class=\"exchange__wrap\"] li:first-child div[class=\"exchange__item-value\"]:nth-child(3)"));


    @Override
    public boolean isLoaded() throws WebElementNotFoundException {
        logger.info("Page " + URL + " is loaded");
        return purchaseRateElem.isDisplayed();
    }

    @Override
    public void openURL() {
        logger.info("Page "+ URL + " open");
        getDriver().get(URL);
    }

    @Override
    public Double getPurchaseRateElemText() throws WebElementNotFoundException {
        return Double.parseDouble(purchaseRateElem.getText().replace(',', '.'));
    }

    @Override
    public Double getSaleRateElemText() throws WebElementNotFoundException {
        return Double.parseDouble(saleRateElem.getText().replace(',', '.'));
    }

    @Override
    public String getBankName() {
        return NAME;
    }
}
