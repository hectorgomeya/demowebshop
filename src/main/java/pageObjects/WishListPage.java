package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Thread.sleep;

public class WishListPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public WishListPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;
   }

    public WebElement deleteWish() {
    boolean isVisible = true;
        while (isVisible) {
        List<WebElement> rows = driver.findElements(By.className("cart-item-row"));
        int size = rows.size();
        if (size == 1) {

            WebElement delete = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[1]/input"));
            wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
            WebElement updateWISH = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]"));
            wait.until(ExpectedConditions.elementToBeClickable(updateWISH)).click();
            isVisible = false;
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div")));


        } else {
            WebElement delete = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr[1]/td[1]/input"));
            wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
            WebElement updateWISH = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]"));
            wait.until(ExpectedConditions.elementToBeClickable(updateWISH)).click();

        }

    }

        return null;




}









}
