package selenium.banks_rate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.Elem;
import selenium.WebDriverConfig;
import selenium.utils.WebElementNotFoundException;

public abstract class BasePage {

    private final WebDriver driver;


    public BasePage() {
        this.driver = WebDriverConfig.getInstance();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public abstract boolean isLoaded() throws WebElementNotFoundException;
    public abstract void openURL();
    public abstract Double getPurchaseRateElemText() throws WebElementNotFoundException;
    public abstract Double getSaleRateElemText() throws WebElementNotFoundException;
    public abstract String getBankName();




}
