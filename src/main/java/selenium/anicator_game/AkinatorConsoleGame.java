package selenium.anicator_game;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Elem;
import selenium.WebDriverConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AkinatorConsoleGame {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getInstance();
        driver.get("http://ru.akinator.com/");

//        Elem acceptCookieButton = new Elem(driver, By.cssSelector("button[class*=\"button__acceptAll\"]"));
//        if (acceptCookieButton.isEnabled()){
//            acceptCookieButton.click();
//        }

        Elem startGameButton = new Elem(driver, By.cssSelector("a[href*=\"/game\"]"));
        startGameButton.click();

        startGame(driver);


    }

    public static void startGame(WebDriver driver) {
        while (true) {
            Elem questionText = new Elem(driver,By.cssSelector("p[class=\"question-text\"]"));
            Elem answerContainer = new Elem(driver,By.cssSelector("div[class^=\"database-selection\"] ul"));

            Elem akinatorAnswer = new Elem(driver, By.cssSelector("span[class=\"proposal-title\"]"));
            Elem akinatorAnswerSubtitle = new Elem(driver, By.cssSelector("span[class=\"proposal-subtitle\"]"));
            Elem finalAnswerContainer = new Elem(driver, By.cssSelector("span[class=\"proposal-answers\"]"));

            System.out.println("Question:\n" + questionText.getText());

            List<WebElement> answerElements = answerContainer.findElements(By.cssSelector("a"));

            for (int i = 0; i < answerElements.size(); i++) {
                WebElement answerElement = answerElements.get(i);
                String answerText = answerElement.getText();
                System.out.println(answerText + " - " + (i + 1));
            }

            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

            if (userAnswer < 0 || userAnswer > answerElements.size()) {
                System.out.println("Wrong number");
                userAnswer = scanner.nextInt();
            } else {
                WebElement selectedAnswer = answerElements.get(userAnswer - 1);
                selectedAnswer.click();
            }

            if (akinatorAnswer.isDisplayed()) {
                System.out.println(akinatorAnswer.getText());
                System.out.println(akinatorAnswerSubtitle.getText());

                List<WebElement> finalAnswerElements = finalAnswerContainer.findElements(By.cssSelector("a"));

                for (int i = 0; i < finalAnswerElements.size(); i++) {
                    WebElement finalAnswerElement = answerElements.get(i);
                    String finalAnswerText = finalAnswerElement.getText();
                    System.out.println(finalAnswerText + " - " + (i + 1));
                }

                int finalUserAnswer = scanner.nextInt();

                if (finalUserAnswer == 1) {
                    WebElement finalSelectedAnswer = finalAnswerElements.get(0);
                    finalSelectedAnswer.click();
                    System.out.println("Game over");
                    break;
                } else if (finalUserAnswer == 2){
                    WebElement finalSelectedAnswer = finalAnswerElements.get(1);
                    finalSelectedAnswer.click();

                }

            }




        }
    }

}
