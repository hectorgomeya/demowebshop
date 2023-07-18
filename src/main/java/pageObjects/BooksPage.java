package pageObjects;

import org.openqa.selenium.By;
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





    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
    WebElement buttonAddToCart;
    //html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input
    //html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input
    //html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input
    //html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input
    //html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a

    @FindBy (xpath = "//*[@id=\"bar-notification\"]/p/text()")
    WebElement addedCorreted;
    public BooksPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;

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

    public String addToCart() {
       // WebElement test = driver.findElement(By.className("Jeans"));
        //test.getClass();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAddToCart)).click();
        String message =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bar-notification\"]/p"))).getText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bar-notification']/span"))).click();

        return message;

//*[@id="bar-notifica

    }
}
