package mavenproject.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderdemotest {

//     @Test(dataProvider = "dataset" )
//     public void test1(String username,String password)
//     {
//         System.out.println(username+"===="+password);
//     }

    @Test(dataProvider = "create" )
    public void test(String username,String password) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(20);
        // driver.close();
        System.out.println(username+"===="+password);
    }

    @DataProvider(name = "create")
    public Object[][] dataset1() { //method name dataset1
        return new Object[][] 
        {
          {"standard_user","secret_sauce"},
          {"problem_user","secret_sauce"}
        };
    }
    


    // @DataProvider
    // public Object[][] dataset() { //method name set
    //     Object[][] dataset = new Object[2][2]; // Changed size to 2 since you're using two sets of data

    //     dataset[0][0] = "user1"; // Changed username to distinguish between the two sets
    //     dataset[0][1] = "password1";

    //     dataset[1][0] = "user2"; // Changed username to distinguish between the two sets
    //     dataset[1][1] = "password2";

    //     return dataset; // Added return statement
    // }
}
