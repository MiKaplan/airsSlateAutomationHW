package selenium.akinator_game.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.Elem;

import java.util.List;

public class AkinatorQuestionPage extends BasePage {

    private final Elem questionText = new Elem(getDriver(), By.cssSelector("p[class=\"question-text\"]"));
    private final Elem answerContainer = new Elem(getDriver(),By.cssSelector("div[class^=\"database-selection\"] ul"));
    private final Elem loader = new Elem(getDriver(),By.cssSelector("div[id=\"div-overlay\"]"));


    public boolean isDisplayed() {
       return questionText.isDisplayed();
    }

    public String getQuestionText() {
        Elem updatedQuestionText = new Elem(getDriver(), By.cssSelector("p[class=\"question-text\"]"));
        updatedQuestionText.waitForVisibility(10);
        return updatedQuestionText.getText();
    }

    public List<WebElement> getAnswerList() {
        Elem updatedAnswerContainer = new Elem(getDriver(),By.cssSelector("div[class^=\"database-selection\"] ul"));
        updatedAnswerContainer.waitForVisibility(10);
        return updatedAnswerContainer.findElement().findElements(By.cssSelector("li"));
    }

//    public void waitLoader(){
//        if (loader.isDisplayed()) {
//            getDriver().manage().timeouts().
//        }
//
//    }
}
