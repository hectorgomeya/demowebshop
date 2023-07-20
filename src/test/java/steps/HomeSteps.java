package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import utilities.TestContext;

public class HomeSteps {
    HomePage homePage;
    TestContext testContext;

    ProductPage productPage;

    private WebDriverWait wait;

    public HomeSteps(TestContext testContext) {
        this.testContext = testContext;
        homePage = testContext.getPageObjectManager().getHomePage();
        productPage = testContext.getPageObjectManager().getProductPage();

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
    public void checkBooks() {
        homePage.goBooks();
        String currentUrl = testContext.getDriverManager().getDriver().getCurrentUrl();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("books"));

    }

    @And("Check than we can navigate to ComputersDesktops")
    public void ComputersDes() {

        homePage.goComputersDesktops();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("desktops"));

    }


    @And("Check than we can navigate to Notebooks")
    public void notebooks() {

        homePage.goComputersLaptos();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("notebooks"));

    }

    @And("Check than we can navigate to accessories")
    public void accessors() {

        homePage.goAccesories();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("accessories"));

    }

    @Given("Go to login button")
    public void login() {

        homePage.goLoginButton();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("login"));

    }
    @Given("Go to cart")
    public void cart() {
        homePage.goCart();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("cart"));

    }

    @And("Check than we can navigate to shoes")
    public void shoes() {

        homePage.goShoes();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("apparel-shoes"));

    }

    @Then("Find product \"(.*)\" and category \"(.*)\"$")
    public void findProduct(String product, String category){
        WebElement currentUrl = homePage.findProduct(product, category);
        String prodUPPER = product.toUpperCase();
        Assert.assertTrue(currentUrl.getText().contains(prodUPPER));
    }

    @Then("Buy a product")
    public void buyProduct()
    {
    productPage.addCart();;
    }

    @And("Review a product \"(.*)\"  \"(.*)\"  \"(.*)\"$")
    public void review(String review, String test, String puntuacion)
    {

        productPage.addReview();
        WebElement message = productPage.review();
        Assert.assertTrue(!message.getText().contains("Only registered users can write reviews"));
        WebElement message2 = productPage.reviewProduct(review, test, puntuacion);
        Assert.assertTrue(message2.getText().contains("Product review is successfully added."));





    }

}
