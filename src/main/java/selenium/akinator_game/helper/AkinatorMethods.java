package selenium.akinator_game.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Elem;
import selenium.WebDriverConfig;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AkinatorMethods {
    static WebDriver driver = WebDriverConfig.getInstance();

    public static void printQuestion(String questionText) {
        System.out.println(questionText);
    }

    public static void printAnswerList(List<WebElement> answerElements) {
        for (int i = 0; i < answerElements.size(); i++) {
            WebElement answerElement = answerElements.get(i);
            String answerText = answerElement.getText();
            System.out.println(answerText + " - " + (i + 1));
        }
    }

    public static void chooseAnswer(List<WebElement> answerElements) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение: ");
        int userAnswer = scanner.nextInt();


            WebElement selectedAnswer = answerElements.get(userAnswer - 1);
            selectedAnswer.click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public static boolean checkAkinatorAnswer(Elem elem) {
        return elem.isEmpty();
    }


}
