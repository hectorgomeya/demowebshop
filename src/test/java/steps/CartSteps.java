package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.BooksPage;
import pageObjects.CartPage;
import utilities.TestContext;

public class CartSteps {
    CartPage cartPage;
    TestContext testContext;

    private WebDriverWait wait;
    private WebElement tempo;

    public CartSteps(TestContext testContext)
    {
        this.testContext = testContext;
        cartPage = testContext.getPageObjectManager().getCartPage();
        wait = testContext.getDriverManager().getWait();
    }

    @Given("Delete a buy")
    public void delete()

    {
       WebElement cart = cartPage.delete();
        Assert.assertTrue(cart.getText()
                .contains("Your Shopping Cart is empty!"));


    }


}
