package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.HomePage;
import utilities.TestContext;

public class HomeSteps {
    HomePage homePage;
    TestContext testContext;

    private WebDriverWait wait;

    public HomeSteps(TestContext testContext){
        this.testContext = testContext;
        homePage = testContext.getPageObjectManager().getHomePage();
        wait = testContext.getDriverManager().getWait();
    }
/*
    @Given("Login form in login page")
    public void goToLoginPage() {
        homePage.clickInLoginButton();
    }

    @Then("Find product \"(.*)\" and category \"(.*)\"$")
    public void findProduct(String product, String category){
        String currentUrl = homePage.findProduct(product, category);
        Assert.assertTrue(currentUrl.contains("prod"));
    }

    @Given("Go to Sing In page")
    public void gotoSingIn() {
        homePage.goToLoginSingIng();
    }
*/



    @And("Check than we can navigate to Books")
    public void checkBooks(){
        homePage.goBooks();
        String currentUrl = testContext.getDriverManager().getDriver().getCurrentUrl();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("books"));

    }

    @And("Check than we can navigate to ComputersDesktops")
    public void ComputersDes(){

        homePage.goComputersDesktops();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("desktops"));

    }


    @And("Check than we can navigate to Notebooks")
    public void notebooks(){

        homePage.goComputersLaptos();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("notebooks"));

    }

    @And("Check than we can navigate to accessories")
    public void accessors(){

        homePage.goAccesories();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("accessories"));

    }

}
