package selenium;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsBuilder {

    public ChromeOptions build() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking"); // Отключение блокировки всплывающих окон
        return options;
    }
}
