package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BooksPage;
import pageObjects.ShoesPage;
import utilities.TestContext;

public class ShoesSteps {
    ShoesPage shoesPage;
    TestContext testContext;

    private WebDriverWait wait;
    private WebElement tempo;

    public ShoesSteps(TestContext testContext)
    {
        this.testContext = testContext;
        shoesPage = testContext.getPageObjectManager().getShoesPage();
        wait = testContext.getDriverManager().getWait();
    }

    @Given("Buy a shoes")
    public void shoes()

    {
        WebElement comprar = shoesPage.addToCart(); //The product has been added to your
        String test = comprar.getText();
        Assert.assertTrue(comprar.getText().contains("The product has been added to your "));


    }


}
