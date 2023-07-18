package managers;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.HashMap;
import java.util.Map;

public class PageObjectManager {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private HomePage homePage;
    private LoginPage loginPage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private ProductPage productPage;
    public Map<String, String> contextData;

    public PageObjectManager(WebDriver driver, WebDriverWait wait, Map<String, String> contextData){
        this.driver = driver;
        this.wait = wait;
        this.contextData = contextData;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver, wait) : homePage;
    }
    public LoginPage getLoginPagePage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver, wait) : loginPage;    }
    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver, wait) : cartPage;
    }
    public CheckOutPage getCheckOutPage() {
        return (checkOutPage == null) ? checkOutPage = new CheckOutPage(driver, wait) : checkOutPage;    }
    public ProductPage getProductPage() {
        return (productPage == null) ? productPage = new ProductPage(driver, wait) : productPage;    }
}