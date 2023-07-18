package selenium.banks_rate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.Elem;
import selenium.WebDriverConfig;

public abstract class BasePage {

    private final WebDriver driver;


    public BasePage() {
        this.driver = WebDriverConfig.getInstance();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public abstract boolean isLoaded();
    public abstract void openURL();
    public abstract Double getPurchaseRateElemText();
    public abstract Double getSaleRateElemText();
    public abstract String getBankName();




}
