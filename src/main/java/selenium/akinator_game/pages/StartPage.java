package selenium.akinator_game.pages;

import org.openqa.selenium.By;
import selenium.Elem;

import java.util.concurrent.TimeUnit;

public class StartPage extends BasePage {
    private final String URL = "http://ru.akinator.com/";
    private final Elem startGameButton = new Elem(getDriver(), By.cssSelector("a[href*=\"/game\"]"));


    public boolean isLoaded() {
        return startGameButton.isEnabled();
    }

    public void clickStartBtn() {
        startGameButton.click();
    }

    public void openURL() {
        getDriver().get(URL);
        startGameButton.waitForVisibility(30);
    }
}
