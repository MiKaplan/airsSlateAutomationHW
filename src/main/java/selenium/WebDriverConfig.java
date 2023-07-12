package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverConfig {

    private static WebDriver driver;

    public WebDriverConfig() {
    }

    public static WebDriver getInstance(){
        if (driver == null) {
//            System.setProperty();
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptionsBuilder().build();
            driver = new ChromeDriver(options);

        }

        return driver;
    }
}
