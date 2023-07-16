package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class BooksPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Map<String, String> contextData;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
    WebElement productName;

    @FindBy(className = "price-container")
    WebElement priceContainer;

    @FindBy(xpath = "//a[text()=\"Add to cart\"]")
    WebElement buttonAddToCart;
    public BooksPage(WebDriver driver, WebDriverWait wait, Map<String, String> contextData){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;

        this.contextData = contextData;
    }
    /*

    public void getPrice(){
        contextData.put("price",wait.until(ExpectedConditions.visibilityOf(priceContainer)).getText().split(" ")[0].split("\\$")[1]);
    }

    public void getProduct(){
        contextData.put("product",wait.until(ExpectedConditions.visibilityOf(productName)).getText());
    }

    public void goToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCart)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
*/

}
