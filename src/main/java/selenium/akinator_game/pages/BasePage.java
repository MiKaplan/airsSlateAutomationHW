package selenium.akinator_game.pages;

import org.openqa.selenium.WebDriver;
import selenium.WebDriverConfig;

public abstract class BasePage {

     private final WebDriver driver = WebDriverConfig.getInstance();

    public WebDriver getDriver() {
        return driver;
    }

}
