package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
        this.driver = driver;
        this.wait = wait;
    }

    public void goBooks() { wait.until(ExpectedConditions.elementToBeClickable(books)).click();}

    public void goComputers() { wait.until(ExpectedConditions.elementToBeClickable(computers)).click();}






}
