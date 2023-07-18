package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class CheckOutPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Map<String, String> contextData;


//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input
//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input
//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[1]/inpu
//html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]


    @FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
    WebElement city;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    WebElement cityAddres;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address2\"]")
    WebElement cityAddres2;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    WebElement postalCode;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_FaxNumber\"]")
    WebElement FaxNumber;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    WebElement phoneNumber;





    public CheckOutPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;

    }


    public void setData()

    {
        city.sendKeys("sasa");
        cityAddres.sendKeys("asas");
        cityAddres2.sendKeys("2121s0");
        FaxNumber.sendKeys("123456789");
        postalCode.sendKeys("46820");
        phoneNumber.sendKeys("789456");
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
        continueButton.click();


    }

}
