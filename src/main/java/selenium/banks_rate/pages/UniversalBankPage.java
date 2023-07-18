package selenium.banks_rate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import selenium.Elem;
import selenium.utils.WebElementNotFoundException;

public class UniversalBankPage extends BasePage{

    private final String URL = "https://www.universalbank.com.ua/";
    private final String NAME = "Universal Bank";

    private final Logger logger = LogManager.getLogger(UniversalBankPage.class);
    Elem purchaseRateElem = new Elem(getDriver(), By.cssSelector("table[class^=\"rate table\"] tr:nth-child(2) td:nth-child(2)"));
    Elem saleRateElem = new Elem(getDriver(), By.cssSelector("table[class^=\"rate table\"] tr:nth-child(2) td:nth-child(3)"));


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
        return Double.parseDouble(purchaseRateElem.getText());
    }
    @Override
    public Double getSaleRateElemText() throws WebElementNotFoundException {
        return Double.parseDouble(saleRateElem.getText());
    }

    @Override
    public String getBankName() {
        return NAME;
    }
}
