package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import utilities.TestContext;

public class CheckOutSteps {
    CheckOutPage checkOut;
    TestContext testContext;

    private WebDriverWait wait;
    private WebElement tempo;

    public CheckOutSteps(TestContext testContext)
    {
        this.testContext = testContext;
        checkOut = testContext.getPageObjectManager().getCheckOutPage();
        wait = testContext.getDriverManager().getWait();
    }

    @Given("Set data check out Name: \"(.*)\" Second Name \"(.*)\" Country \"(.*)\" City \"(.*)\" and postal code \"(.*)\" and number \"(.*)\" and direccion \"(.*)\"$" )
    public void setCheckOut(String nombre, String apellidos, String pais, String ciudad, String postalcode, String number, String direccion)

    {
        String direccionCompleta = nombre+" "+apellidos+", "+direccion+", "+ciudad+" "+postalcode+", "+pais;
        String billing = checkOut.setData(nombre, apellidos, pais,ciudad,postalcode, number, direccion);
        Assert.assertTrue(billing.contains(direccionCompleta));


        WebElement setData = checkOut.fase2(nombre, apellidos, pais,ciudad,postalcode, number, direccion);
        Assert.assertTrue(setData.getText().contains("Your order has been successfully processed!"));



    }


}
