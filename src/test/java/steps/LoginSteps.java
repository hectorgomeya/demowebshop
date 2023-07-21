package steps;

import io.cucumber.java.*;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.TestContext;

public class LoginSteps {
    LoginPage loginPage;
    TestContext testContext;

    Hooks hoks;

    private WebDriverWait wait;

    Scenario scenario;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
        loginPage = testContext.getPageObjectManager().getLoginPagePage();
        wait = testContext.getDriverManager().getWait();
    }
    @Before
    public void before(Scenario scenario) throws Exception {
        this.scenario = scenario;
        takeImages(scenario);

    }



    @Then("Insert user \"(.*)\" and password \"(.*)\" and \"(.*)\"$")
    public void login(String username, String password, String flag) throws Exception {
        switch (flag.toLowerCase()) {
            case "correcto":

                WebElement loginCheckCorrect = loginPage.login(username, password, flag);

                Assert.assertTrue(loginCheckCorrect.getText()
                        .contains(username));

                break;
            case "incorrect":


                WebElement loginCheckIncorrect = loginPage.login(username, password, flag);
                Assert.assertTrue(loginCheckIncorrect.getText().contains("Login was unsuccessful"));

                break;

            case "mailincorrecto":

                WebElement emailIncorrecto = loginPage.login(username, password, flag);
                Assert.assertTrue(emailIncorrecto.getText().contains("Please enter a valid email address."));



        }

    }

    @And("Log out from demowebshop")
    public void logOut() throws Exception {
        String result = loginPage.logOut();
        Assert.assertTrue(result.contains("Register"));



    }
    public void takeImages(Scenario scenario) throws Exception {
        if(!scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot)testContext.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }


    }



}
