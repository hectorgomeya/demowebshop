package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
    WebElement books;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
    WebElement computers;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
    WebElement desktop;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a")
    WebElement noteBooks;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a")
    WebElement accesories;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement cart;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
    WebElement shoes;


    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
        this.driver = driver;
        this.wait = wait;
    }

    public void goBooks() { wait.until(ExpectedConditions.elementToBeClickable(books)).click();

    }

    public void goComputersDesktops() {

        Actions builder = new Actions(driver);
        builder.moveToElement(computers).perform();
        wait.until(ExpectedConditions.elementToBeClickable(desktop)).click();

    }

    public void goComputersLaptos() {

        Actions builder = new Actions(driver);
        builder.moveToElement(computers).perform();
        wait.until(ExpectedConditions.elementToBeClickable(noteBooks)).click();

    }


    public void goAccesories() {

        Actions builder = new Actions(driver);
        builder.moveToElement(computers).perform();
        wait.until(ExpectedConditions.elementToBeClickable(accesories)).click();

    }

    public void goLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();


    }

    public void goCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cart)).click();


    }


    public void goShoes() {
        wait.until(ExpectedConditions.elementToBeClickable(shoes)).click();


    }




}
