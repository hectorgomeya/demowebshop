package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

    @Given("Estimate a shipping")
    public void shippong()

    {
        WebElement shiping =  cartPage.estimatedShipping();
        Assert.assertTrue(shiping.getText()
                .contains("Compared to other shipping methods, like by flight or over seas, ground shipping is carried out closer to the earth"));


    }
    @Given("Go to checkout")
    public void checkOut(){
        cartPage.checkOut();
        Assert.assertTrue(testContext.getDriverManager().getDriver().getCurrentUrl().contains("onepagecheckout"));

    }



}
