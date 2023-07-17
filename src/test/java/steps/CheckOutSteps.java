package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import utilities.TestContext;

public class CheckOutSteps {
    CheckOutPage checkOut;
    TestContext testContext;

    private WebDriverWait wait;
    private WebElement tempo;

    public CheckOutSteps(TestContext testContext)
    {
        this.testContext = testContext;
        checkOut = testContext.getPageObjectManager().getCheckOutPage();
        wait = testContext.getDriverManager().getWait();
    }

    @Given("Set data check out")
    public void setCheckOut()

    {
   checkOut.setData();


    }


}
