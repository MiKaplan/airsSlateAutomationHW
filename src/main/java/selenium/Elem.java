package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Elem {

    private final WebDriver driver;
    private final By by;

    public Elem(WebDriver driver, By by) {
        this.driver = driver;
        this.by = by;
    }

    public WebElement findElement() {
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

//    public List<WebElement> findElements(By selector) {
//        return by.findElements(selector);
//    }

    public void click() {
        findElement().click();
    }

    public void sendKeys(String text) {
        findElement().sendKeys(text);
    }

    public void waitForVisibility(int timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(findElement()));
    }
    public boolean isEmpty() {
        return driver.findElements(by).isEmpty();
    }
    public boolean isEnabled() {
        waitForVisibility(10);
        return findElement().isEnabled();
    }

    public boolean isDisplayed() {
        waitForVisibility(10);
        return findElement().isDisplayed();
    }

    public String getText() {
        return findElement().getText();
    }

}
