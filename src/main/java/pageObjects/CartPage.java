package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Map<String, String> contextData;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")
    WebElement updateCart;
    @FindBy (xpath = "//*[@id=\"CountryId\"]")
    WebElement shipping;
    @FindBy (xpath = "//*[@id=\"ZipPostalCode\"]")
    WebElement zipCode;
    @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input")
    WebElement buttonShipping;
    @FindBy (xpath = "//*[@id=\"termsofservice\"]")
    WebElement agreeTerms;
    @FindBy (xpath = "//*[@id=\"checkout\"]")
    WebElement checkOutButton;

    public CartPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;

    }

    public WebElement  delete() {

        boolean isVisible = true;
        while (isVisible) {
            List<WebElement> rows = driver.findElements(By.className("cart-item-row"));
            int size = rows.size();
            if (size == 1) {
                WebElement delete = driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input"));
                wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
                wait.until(ExpectedConditions.elementToBeClickable(updateCart)).click();
                isVisible = false;
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[4]/div[1]/div[4]/div/div[2]/div[2]/div")));


            } else {
                WebElement delete = driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input\n"));
                wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
                wait.until(ExpectedConditions.elementToBeClickable(updateCart)).click();


            }

        }

        return null;




    }

     public WebElement estimatedShipping()
     {
         shipping.sendKeys("Spain");
         zipCode.sendKeys("46018");
         wait.until(ExpectedConditions.elementToBeClickable(buttonShipping)).click();
         return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/ul/li[1]/span")));
     }


     public void checkOut() {
         wait.until(ExpectedConditions.elementToBeClickable(agreeTerms)).click();
         wait.until(ExpectedConditions.elementToBeClickable(checkOutButton)).click();
             }


    public void checkOutNoTerms() {
        wait.until(ExpectedConditions.elementToBeClickable(checkOutButton)).click();
    }
}
