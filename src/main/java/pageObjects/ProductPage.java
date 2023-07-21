package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

import static java.lang.Thread.sleep;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;
   }

    public void addCart() {
       WebElement addCart = driver.findElement(By.className("add-to-cart-button"));
        wait.until(ExpectedConditions.elementToBeClickable(addCart)).click();

    }

    public void addReview(){
        WebElement addReview = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[5]/div[2]/a[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(addReview)).click();

    }

    public WebElement review(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"review-form\"]")));

        ///*[@id="review-form"]

    }
    public WebElement reviewProduct(String title, String test, String puntuacionPro) {//*[@id="AddProductReview_Title"]
        WebElement addReview = driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]"));
        addReview.sendKeys(title);
        WebElement titlereview = driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]"));
        titlereview.sendKeys(test);
        String puntuacion2 = "addproductrating_" + puntuacionPro;
        WebElement puntuacion = driver.findElement(By.id(puntuacion2));
        wait.until(ExpectedConditions.elementToBeClickable(puntuacion)).click();
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/input"));
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
        WebElement message = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]"));
        return message;

    }

    public void addWishList() {

        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement addwish= driver.findElement(By.xpath("//*[@value='Add to wishlist']"));

        wait.until(ExpectedConditions.elementToBeClickable(addwish)).click();
        WebElement buttonwish = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]"));
        buttonwish.click();

        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }








}
