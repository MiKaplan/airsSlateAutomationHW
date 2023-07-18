package akinator_tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.akinator_game.helper.AkinatorMethods;
import selenium.akinator_game.pages.AkinatorAnswerPage;
import selenium.akinator_game.pages.AkinatorQuestionPage;
import selenium.akinator_game.pages.StartPage;

import static org.testng.Assert.assertTrue;

public class AkinatorTests {

    static StartPage startPage = new StartPage();
    static AkinatorQuestionPage akinatorQuestionPage = new AkinatorQuestionPage();
    static AkinatorAnswerPage akinatorAnswerPage = new AkinatorAnswerPage();

    public static void main(String[] args) {


        startPage.openURL();

        assertTrue(startPage.isLoaded(), "Page is not loaded");
        startPage.clickStartBtn();
        playGame();

    }

    public static void playGame() {
        boolean checkAkinatorAnswer = false;
        while (!checkAkinatorAnswer) {
            AkinatorMethods.printQuestion(akinatorQuestionPage.getQuestionText());
            AkinatorMethods.printAnswerList(akinatorQuestionPage.getAnswerList());
            AkinatorMethods.chooseAnswer(akinatorQuestionPage.getAnswerList());
            checkAkinatorAnswer = !AkinatorMethods.checkAkinatorAnswer(akinatorAnswerPage.getAkinatorAnswer());
        }

        AkinatorMethods.printQuestion(akinatorAnswerPage.getAkinatorAnswerText());
        AkinatorMethods.printQuestion(akinatorAnswerPage.getAkinatorAnswerSubtitleText());
        AkinatorMethods.printAnswerList(akinatorAnswerPage.getFinalAnswerContainerList());
        AkinatorMethods.chooseAnswer(akinatorAnswerPage.getFinalAnswerContainerList());

        if (AkinatorMethods.checkAkinatorAnswer(akinatorAnswerPage.getAkinatorAnswer())) {
            playGame();
        } else {
            System.out.println("Game over");
        }
    }


//    StartPage startPage;
//    AkinatorQuestionPage akinatorQuestionPage;
//    AkinatorAnswerPage akinatorAnswerPage;
//
//    @BeforeMethod
//    void preCondition(){
//        startPage = new StartPage();
//        akinatorQuestionPage = new AkinatorQuestionPage();
//        akinatorAnswerPage = new AkinatorAnswerPage();
//
//
//    }
//
//    @Test
//    void playGame() {
//        startPage.openURL();
//
//        assertTrue(startPage.isLoaded(), "Page is not loaded");
//        startPage.clickStartBtn();
//
//        boolean checkAkinatorAnswer = false;
//
//        while (!checkAkinatorAnswer) {
//            AkinatorMethods.printQuestion(akinatorQuestionPage.getQuestionText());
//            AkinatorMethods.printAnswerList(akinatorQuestionPage.getAnswerList());
//            AkinatorMethods.chooseAnswer(akinatorQuestionPage.getAnswerList());
//            checkAkinatorAnswer = AkinatorMethods.checkAkinatorAnswer(akinatorAnswerPage.getAkinatorAnswer());
//        }
//
//        AkinatorMethods.printQuestion(akinatorAnswerPage.getAkinatorAnswerText());
//        AkinatorMethods.printQuestion(akinatorAnswerPage.getAkinatorAnswerSubtitleText());
//        AkinatorMethods.printAnswerList(akinatorAnswerPage.getFinalAnswerContainerList());
//        AkinatorMethods.chooseAnswer(akinatorAnswerPage.getFinalAnswerContainerList());
//



//    }
}
