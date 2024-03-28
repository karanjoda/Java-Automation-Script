package mavenproject.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest{
    WebDriver driver;
   @Test
    public void titleTest() {
        String expectedTitle = "Facebook – log in or sign up";

        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle); 

    }

  
}
