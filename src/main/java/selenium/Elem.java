package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.utils.WebElementNotClickableException;
import selenium.utils.WebElementNotFoundException;

import java.time.Duration;
import java.util.List;

public class Elem {

    private final WebDriver driver;
    private final By by;

    public Elem(WebDriver driver, By by) {
        this.driver = driver;
        this.by = by;
    }

    public WebElement findElement() throws WebElementNotFoundException{
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        } catch (NoSuchElementException e) {
            throw new WebElementNotFoundException("Element with locator " + by + " not found");
        }

    }


    public void click() throws WebElementNotClickableException {
        try {
            findElement().click();

        } catch (WebElementNotFoundException exception) {
            throw new WebElementNotClickableException("Element with locator " + by + " is not clickable");
        }

    }

    public void sendKeys(String text) throws WebElementNotFoundException {
        findElement().sendKeys(text);
    }

    public void waitForVisibility(int timeoutInSeconds) throws WebElementNotFoundException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(findElement()));
    }
    public boolean isEmpty() {
        return driver.findElements(by).isEmpty();
    }
    public boolean isEnabled() throws WebElementNotFoundException {
        waitForVisibility(10);
        return findElement().isEnabled();
    }

    public boolean isDisplayed() throws WebElementNotFoundException {
        waitForVisibility(10);
        return findElement().isDisplayed();
    }

    public String getText() throws WebElementNotFoundException {
        return findElement().getText();
    }

}
