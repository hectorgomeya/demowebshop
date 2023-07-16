package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.HashMap;
import java.util.Map;

public class PageObjectManager {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private HomePage homePage;


    public Map<String, String> contextData;

    public PageObjectManager(WebDriver driver, WebDriverWait wait, Map<String, String> contextData){
        this.driver = driver;
        this.wait = wait;
        this.contextData = contextData;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver, wait) : homePage;
    }

}
