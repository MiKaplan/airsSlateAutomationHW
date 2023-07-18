package selenium.banks_rate.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import selenium.Elem;
import selenium.utils.WebElementNotFoundException;

public class OschadBankPage extends BasePage{

    private final String URL = "http://www.oschadbank.ua/ua/";
    private final String NAME = "Oschad Bank";

    private final Logger logger = LogManager.getLogger(OschadBankPage.class);
    private final Elem purchaseRateElem = new Elem(getDriver(), By.cssSelector("a[class=\"currency header__currency\"] div:first-child span[class=\"currency__item_value\"]:nth-child(2)"));
    private final Elem saleRateElem = new Elem(getDriver(), By.cssSelector("a[class=\"currency header__currency\"] div:first-child span[class=\"currency__item_value\"]:nth-child(3)"));


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
