package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class CheckOutPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Map<String, String> contextData;

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

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @FindBy( id = "BillingNewAddress_FirstName")
    WebElement name;

    @FindBy (id = "BillingNewAddress_LastName")
    WebElement secondname;

    public CheckOutPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;

    }





    public String setData(String nombre, String apellidos, String pais, String ciudad, String postalcode, String number, String direccion) {//*[@id="shipping-buttons-container"]/input
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
        if (country.isDisplayed()) {
            secondname.clear();
            name.sendKeys(nombre);
            secondname.sendKeys(apellidos);
            country.sendKeys(pais);
            city.sendKeys(ciudad);
            postalCode.sendKeys(postalcode);
            country.sendKeys(pais);
            phoneNumber.sendKeys(number);
            cityAddres.sendKeys(direccion);
            continueButton.click();   name.clear();
        }

        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement tesr1 = driver.findElement(By.xpath("//*[@id=\"shipping-address-select\"]"));
        tesr1.click();

WebElement lista = driver.findElement(By.xpath( "//*[@id=\"shipping-address-select\"]/option[1]"));
String aa = lista.getText();
return aa;



    }

    public WebElement fase2 (String nombre, String apellidos, String pais, String ciudad, String postalcode, String number, String direccion) {

        WebElement shippingButton = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
        WebElement shipingMe = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
        WebElement paymethod = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
        WebElement payinfo = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
        WebElement fini = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));

        wait.until(ExpectedConditions.elementToBeClickable(shippingButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(shipingMe)).click();
        wait.until(ExpectedConditions.elementToBeClickable(paymethod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(payinfo)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fini)).click();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")));





    }



        public WebElement checkOutWithOutAccept()
    {
        WebElement termsSerive = driver.findElement(By.xpath("//*[@id=\"terms-of-service-warning-box\"]/p"));
        return termsSerive;


    }

}
