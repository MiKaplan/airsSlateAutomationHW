package selenium.akinator_game.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.Elem;

import java.util.List;

public class AkinatorAnswerPage extends BasePage{

    private final Elem akinatorAnswer = new Elem(getDriver(), By.cssSelector("span[class=\"proposal-title\"]"));
    private final Elem akinatorAnswerSubtitle = new Elem(getDriver(), By.cssSelector("span[class=\"proposal-subtitle\"]"));
    private final Elem finalAnswerContainer = new Elem(getDriver(), By.cssSelector("span[class=\"proposal-answers\"]"));

    public Elem getAkinatorAnswer() {
        return akinatorAnswer;
    }

    public String getAkinatorAnswerText() {
        return akinatorAnswer.getText();
    }

    public String getAkinatorAnswerSubtitleText() {
        return akinatorAnswer.getText();
    }

    public List<WebElement> getFinalAnswerContainerList() {
        return finalAnswerContainer.findElement().findElements(By.cssSelector("a"));
    }

}
