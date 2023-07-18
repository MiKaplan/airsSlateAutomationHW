package banks_tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.WebDriverConfig;
import selenium.banks_rate.helper.BanksCalculateMethods;
import selenium.banks_rate.pages.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class BanksTests {
    BasePage basePage;
    PrivatBankPage privatBankPage;
    UkrSibBankPage ukrSibBankPage;
    UniversalBankPage universalBankPage;
    OschadBankPage oschadBankPage;
    List<Double> purchaseRates;
    List<Double> saleRates;
    List<String> bankNames;

    @BeforeMethod
    void preCondition(){
        privatBankPage = new PrivatBankPage();
        ukrSibBankPage = new UkrSibBankPage();
        universalBankPage = new UniversalBankPage();
        oschadBankPage = new OschadBankPage();

        bankNames = new ArrayList<>();
        purchaseRates = new ArrayList<>();
        saleRates = new ArrayList<>();

    }

    @Test
    void compareBankExchangeRates() {
        privatBankPage.openURL();

        assertTrue(privatBankPage.isLoaded(), "Privat Bank page is not loaded");
        bankNames.add(privatBankPage.getBankName());
        purchaseRates.add(privatBankPage.getPurchaseRateElemText());
        saleRates.add(privatBankPage.getSaleRateElemText());

        ukrSibBankPage.openURL();

        assertTrue(ukrSibBankPage.isLoaded(), "UkrSib Bank page is not loaded");
        bankNames.add(ukrSibBankPage.getBankName());
        purchaseRates.add(ukrSibBankPage.getPurchaseRateElemText());
        saleRates.add(ukrSibBankPage.getSaleRateElemText());

//        universalBankPage.openURL();
//
//        assertTrue(ukrSibBankPage.isLoaded(), "Universal Bank page is not loaded");
//        bankNames.add(ukrSibBankPage.getBankName());
//        purchaseRates.add(ukrSibBankPage.getPurchaseRateElemText());
//        saleRates.add(ukrSibBankPage.getSaleRateElemText());

        oschadBankPage.openURL();
        assertTrue(oschadBankPage.isLoaded(), "Oschad Bank page is not loaded");
        bankNames.add(oschadBankPage.getBankName());
        purchaseRates.add(oschadBankPage.getPurchaseRateElemText());
        saleRates.add(oschadBankPage.getSaleRateElemText());

        BanksCalculateMethods.calculateAverage(purchaseRates);
        BanksCalculateMethods.calculateAverage(saleRates);
        BanksCalculateMethods.findHighestRateIndex(bankNames, purchaseRates);
        BanksCalculateMethods.findLowestRateIndex(bankNames, saleRates);


    }

    @AfterMethod
    void postCondition() {
        oschadBankPage.getDriver().quit();
    }


}
