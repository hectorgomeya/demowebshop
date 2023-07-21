package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.WishListPage;
import utilities.TestContext;

import java.util.List;

public class WishSteps {
    CartPage cartPage;
    TestContext testContext;

    WishListPage wishListPage;

    CheckOutPage checkOutPage;

    private WebDriverWait wait;
    private WebElement tempo;

    public WishSteps(TestContext testContext)
    {
        this.testContext = testContext;
        wishListPage = testContext.getPageObjectManager().getWishListPage();
        wait = testContext.getDriverManager().getWait();
        checkOutPage = testContext.getPageObjectManager().getCheckOutPage();
    }



    @Given("Delete a wish from list")
    public void delete() {
     WebElement delete =   wishListPage.deleteWish();
     Assert.assertTrue(delete.getText().contains("The wishlist is empty!"));


    }

}
