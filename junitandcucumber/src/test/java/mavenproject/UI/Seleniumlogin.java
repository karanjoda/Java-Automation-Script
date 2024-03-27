package mavenproject.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumlogin {

    public WebDriver driver;

    @Test
    public void loginWithChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginTest();
    }

    @Test
    public void loginWithFirefox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        loginTest();
    }

    @Test
    public void loginWithEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        loginTest();
    }

    public void loginTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        // Perform additional actions or assertions if needed
        driver.quit();
    }
}
