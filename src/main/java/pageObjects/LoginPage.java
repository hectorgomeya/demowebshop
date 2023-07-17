package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Map<String, String> contextData;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement password;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
    WebElement login;

    @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
    WebElement errorLogin;
    public LoginPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;

   }

    public WebElement login(String username, String password, String flag ) {


        switch (flag)
    {
            case "incorrecto":
                wait.until(ExpectedConditions.visibilityOf(this.email)).sendKeys(username);
                wait.until(ExpectedConditions.visibilityOf(this.password)).sendKeys(password);
                wait.until(ExpectedConditions.elementToBeClickable(this.login)).click();
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")));

                case "correcto":
                wait.until(ExpectedConditions.visibilityOf(this.email)).sendKeys(username);
                wait.until(ExpectedConditions.visibilityOf(this.password)).sendKeys(password);
                wait.until(ExpectedConditions.elementToBeClickable(this.login)).click();
               return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
            case "mailincorrecto":
                wait.until(ExpectedConditions.visibilityOf(this.email)).sendKeys(username);
                wait.until(ExpectedConditions.elementToBeClickable(this.login)).click();
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")));


        }

    return null;

    }






}
