package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BooksPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.TestContext;

public class BooksSteps {
    BooksPage booksPage;
    TestContext testContext;

    private WebDriverWait wait;
    private WebElement tempo;

    public BooksSteps(TestContext testContext)
    {
        this.testContext = testContext;
        booksPage = testContext.getPageObjectManager().getBooksPageage();
        wait = testContext.getDriverManager().getWait();
    }

    @Given("Buy a book")
    public void comprar_libro()

    {
        String comprar = booksPage.addToCart(); //The product has been added to your
        Assert.assertTrue(comprar.contains("The product has been added to your "));


    }


}
